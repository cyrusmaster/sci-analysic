package com.hzsun.bigdata.sci.config;

import com.hzsun.bigdata.sci.dao.TableMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;
//import org.zy.zbp.boot.config.utils.SpringUtils;


import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

@Slf4j
@Component
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class MySqlInterceptor implements Interceptor {

    @Resource
    TableMapper tableMapper;

    /**
     * 重写拦截逻辑
     *
     * @param invocation invocation
     * @return Object
     * @author WangXin
     * @date 2023/1/15 21:54
     **/
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

        BoundSql boundSql = statementHandler.getBoundSql();
        // 获取到原始sql语句
        String sql = boundSql.getSql().toLowerCase();

        // 增强sql
        sql = enhanceSql(sql);

        // 通过反射修改sql语句
        Field field = boundSql.getClass().getDeclaredField("sql");
        field.setAccessible(true);
        field.set(boundSql, sql);

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

	@Override
	public void setProperties(Properties properties) {

	 String dialect = properties.getProperty("dialect");
     log.info("mybatis intercept dialect:{}", dialect);


	}

	/**
     * SQL增强
     * 动态替换表名为实体表
     * 示例：&{TABLE_EXAMPLE} -> TABLE_EXAMPLE_D_20230101
     *
     * @return String
     * @author WangXin
     * @date 2023/1/4 19:30
     **/
    private String enhanceSql(String sql) throws SQLException {
        StringBuilder newSql = new StringBuilder();
        int length = sql.length();
        for (int i = 0; i < length; i++) {
            char c = sql.charAt(i);
            if (c != '@') {
                newSql.append(c);
                continue;
            }
            int nextIndex = i + 1;
            if (sql.charAt(nextIndex) != '{') {
                newSql.append(c);
                continue;
            }
            StringBuilder argName = new StringBuilder();
            i = parseSqlArgs(argName, sql, nextIndex);
            if (i < nextIndex) {
                newSql.append(c);
                continue;
            }
            String tableNameTemp = argName.toString().trim();
            // 获取最新表


            //TableMapper tableMapper = SpringUtils.getBean(TableMapper.class);

            String latestTableName = tableMapper.getLatestTableName(tableNameTemp);
            if (latestTableName == null) {
                log.error("表名替换时查询表名不存在：{}", tableNameTemp);
                throw new SQLException(tableNameTemp + "替换时查询无日期表");
            }
            newSql.append(latestTableName);
        }

        return newSql.toString();
    }

    /**
     * 获取 @{} 的右括号的下标
     *
     * @param argName   argName
     * @param sql       sql
     * @param nextIndex nextIndex
     * @return int
     * @author WangXin
     * @date 2023/1/4 19:36
     **/
    private int parseSqlArgs(StringBuilder argName, String sql, int nextIndex) {
        int i = nextIndex;
        i++;
        for (; i < sql.length(); i++) {
            char c = sql.charAt(i);
            if (c != '}') {
                argName.append(c);
            } else {
                return i;
            }
        }
        return nextIndex - 1;
    }

}