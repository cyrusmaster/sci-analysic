package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.DrawDTO;
import com.hzsun.bigdata.sci.model.dto.SciAbleCommonDTO;
import com.hzsun.bigdata.sci.model.dto.SciSchDetailDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: SciAbleDao
 * @Description: 科研能力横向对比Dao
 * @Date: 2020-08-31 14:50
 */
@Repository
public interface SciAbleDao {
    /**
     * Description: 科研平台
     *
     * @param tableName
     * @param year
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciAbleCommonDTO>
     * @author: luomeng
     * @date: 2020/8/31 16:03
     */
    List<SciAbleCommonDTO> getSciPlatForm(@Param("tableName") String tableName,
                                          @Param("year") String year);

    /**
     * Description: 人才资源
     *
     * @param tableName
     * @param year
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciAbleCommonDTO>
     * @author: luomeng
     * @date: 2020/8/31 16:03
     */
    List<SciAbleCommonDTO> getHumanSrc(@Param("tableName") String tableName,
                                       @Param("year") String year);

    /**
     * Description: 对标同类型高校学科图表
     *
     * @param tableName
     * @param sciNo
     * @param year
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/31 16:03
     */
    List<DrawDTO> subjCompareDraw(@Param("tableName") String tableName,
                                  @Param("year") String year,
                                  @Param("sciNo") String sciNo);

    /**
     * Description: 综合对比
     *
     * @param tableName
     * @param sciNo
     * @param year
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciAbleCommonDTO>
     * @author: luomeng
     * @date: 2020/8/31 16:03
     */
    List<SciAbleCommonDTO> getFixCompare(@Param("tableName") String tableName,
                                         @Param("year") String year,
                                         @Param("sciNo") String sciNo);

    /**
     * Description: 其他学校明细
     *
     * @param tableName
     * @param sciNo
     * @param limit
     * @param offset
     * @param year
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSchDetailDTO>
     * @author: luomeng
     * @date: 2020/8/31 16:03
     */
    List<SciSchDetailDTO> getSchDetail(@Param("tableName") String tableName,
                                       @Param("year") String year,
                                       @Param("sciNo") String sciNo,
                                       @Param("limit") Integer limit,
                                       @Param("offset") Integer offset);

    /**
     * Description: 其他学校明细(计数)
     *
     * @param tableName
     * @param sciNo
     * @param year
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/4 10:27
     */
    Integer getSchDetailCount(@Param("tableName") String tableName,
                              @Param("year") String year,
                              @Param("sciNo") String sciNo);
}