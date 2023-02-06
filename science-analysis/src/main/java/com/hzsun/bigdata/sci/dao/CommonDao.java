package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.CollegeMsgDTO;
import com.hzsun.bigdata.sci.model.dto.DimClassDTO;
import com.hzsun.bigdata.sci.model.dto.ItemClassDTO;
import com.hzsun.bigdata.sci.model.dto.TeacherMsgDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: CommonDao
 * @Description: 常用sql dao
 * @Date: 2020/8/17 14:57
 */
@Repository
public interface CommonDao {

    /**
     * Description: 通过表名前缀查询最新最新日期的表名
     *
     * @param table
     * @return: java.lang.String
     * @author: luomeng
     * @date: 2020/6/23 8:18
     */
    String findLatestTableByPrefix(@Param("table") String table);

    /**
     * Description: 通过表名前缀和年份查询最新最新日期的日表表名
     *
     * @param table
     * @param year
     * @return: java.lang.String
     * @author: luomeng
     * @date: 2020/6/23 8:18
     */
    String findLatestDayTableByYear(@Param("table") String table, @Param("year") String year);

    /**
     * Description: 通过表名前缀和年份查询最新最新日期的月表表名
     *
     * @param table
     * @param year
     * @return: java.lang.String
     * @author: luomeng
     * @date: 2020/6/23 8:18
     */
    String findLatestMonTableByYear(@Param("table") String table, @Param("year") String year);

    /**
     * Description: 通过表名前缀和年份查询最新最新日期的年表表名
     *
     * @param table
     * @param year
     * @return: java.lang.String
     * @author: luomeng
     * @date: 2020/6/23 8:18
     */
    String findLatestYearTableByYear(@Param("table") String table, @Param("year") String year);

    /**
     * Description: 通过表名前缀、年份、月份查询最新最新日期的日表表名
     *
     * @param table
     * @param year
     * @param month
     * @return: java.lang.String
     * @author: luomeng
     * @date: 2020/6/23 8:18
     */
    String findLatestDayTableByYearMonth(@Param("table") String table,
                                         @Param("year") String year,
                                         @Param("month") Integer month);

    /**
     * Description: 通过表名前缀、年份、月份查询最新最新日期的月表表名
     *
     * @param table
     * @param year
     * @param month
     * @return: java.lang.String
     * @author: luomeng
     * @date: 2020/6/23 8:18
     */
    String findLatestMonTableByYearMonth(@Param("table") String table,
                                         @Param("year") String year,
                                         @Param("month") Integer month);

    /**
     * Description: 获取维表类信息（第一层）
     *
     * @param dimClass
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DimClassDTO>
     * @author: luomeng
     * @date: 2020/8/18 9:25
     */
    List<DimClassDTO> getDimClassFirst(@Param("dimClass") String dimClass);


    /**
     * Description: 获取维表类信息（根据前一级维度值）
     *
     * @param dimClass
     * @param preValue
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DimClassDTO>
     * @author: luomeng
     * @date: 2020/8/18 9:25
     */
    List<DimClassDTO> getDimClassWithPre(@Param("dimClass") String dimClass, @Param("preValue") String preValue);

    /**
     * Description: 获取维表类信息（根据层级）
     *
     * @param dimClass
     * @param layer
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DimClassDTO>
     * @author: luomeng
     * @date: 2020/8/18 9:25
     */
    List<DimClassDTO> getDimClassWithLayer(@Param("dimClass") String dimClass, @Param("layer") String layer);

    /**
     * Description: 获取学院列表
     *
     * @param unitTableName
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.CollegeMsgDTO>
     * @author: luomeng
     * @date: 2020/8/20 16:03
     */
    List<CollegeMsgDTO> getCollege(@Param("unitTableName") String unitTableName);

    /**
     * Description: 获取课题类型
     *
     * @param itemTableName
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ItemClassDTO>
     * @author: luomeng
     * @date: 2020/8/24 10:16
     */
    List<ItemClassDTO> getItemClass(@Param("itemTableName") String itemTableName);

    /**
     * Description: 模糊查询教师信息
     *
     * @param tableName
     * @param staffName
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.TeacherMsgDTO>
     * @author: luomeng
     * @date: 2020/9/11 14:41
     */
    List<TeacherMsgDTO> getTeachMsg(@Param("tableName")String tableName,@Param("staffName") String staffName);
}
