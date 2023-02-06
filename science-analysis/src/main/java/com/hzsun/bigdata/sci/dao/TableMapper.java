package com.hzsun.bigdata.sci.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface TableMapper {

    /**
     * 获取最新表名
     *
     * @param tableTemp tableTemp
     * @return String
     * @author WangXin
     * @date 2023/1/4 19:42
     **/
    String getLatestTableName(String tableTemp);

}
