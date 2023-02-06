package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: SchDevDao
 * @Description: 学校发展概况dao
 * @Date: 2020-08-17 17:23
 */
@Repository
public interface SchDevDao {
    /**
     * Description: 获取各单位考核指标总体概况
     *
     * @param year
     * @return: com.hzsun.bigdata.sci.model.dto.GeneralAssessDTO
     * @author: luomeng
     * @date: 2020/8/18 9:46
     */
    GeneralAssessDTO getGeneralAssess(@Param("year") String year);

    /**
     * Description: 各单位目标任务完成率统计
     *
     * @param year
     * @param unitClassNo
     * @param unitTableName
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/18 10:01
     */
    List<DrawDTO> getEveryFinishRate(@Param("year") String year,
                                     @Param("unitClassNo") String unitClassNo,
                                     @Param("unitTableName") String unitTableName);

    /**
     * Description: 各单位贡献奖励统计
     *
     * @param year
     * @param unitClassNo
     * @param unitTableName
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/19 16:06
     */
    List<DrawDTO> getContrbAwardScoreDraw(@Param("year") String year,
                                          @Param("unitClassNo") String unitClassNo,
                                          @Param("unitTableName") String unitTableName);

    /**
     * Description: 各单位负面扣减分值统计
     *
     * @param year
     * @param unitClassNo
     * @param unitTableName
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/19 16:06
     */
    List<DrawDTO> getDeductionScoreDraw(@Param("year") String year,
                                        @Param("unitClassNo") String unitClassNo,
                                        @Param("unitTableName") String unitTableName);

    /**
     * Description: 核心指标总体概况
     *
     * @param year
     * @return: com.hzsun.bigdata.sci.model.dto.GeneralCoreIndexDTO
     * @author: luomeng
     * @date: 2020/8/18 11:25
     */
    GeneralCoreIndexDTO generalCoreIndex(@Param("year") String year);

    /**
     * Description: 科研横向项目数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/18 16:31
     */
    List<DrawDTO> getCountProjectHDraw(@Param("year") String year, @Param("type") Integer type);

    /**
     * Description: 科研纵向项目数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/18 16:31
     */
    List<DrawDTO> getCountProjectVDraw(@Param("year") String year, @Param("type") Integer type);

    /**
     * Description: 科研成果数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/18 16:47
     */
    List<DrawDTO> getSciAchievementDraw(@Param("year") String year, @Param("type") Integer type);

    /**
     * Description: 科研成果等级分布
     *
     * @param year
     * @param type 0:纵向项目 1:奖励 2:著作 3:专利 4:软著 5:艺术作品 6:研究报告
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 13:51
     */
    List<DrawDTO> getSciLevelDraw(String year, Integer type);

    /**
     * Description: 科研经费金额统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/18 17:00
     */
    List<DrawDTO> getSciFeeDraw(@Param("year") String year, @Param("type") Integer type);

    /**
     * Description: 科研经费到位情况统计
     *
     * @param year
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/18 17:09
     */
    List<DrawDTO> getSciFeeArriveDraw(@Param("year") String year);

    /**
     * Description: 获奖统计
     *
     * @param year
     * @param honorType
     * @param achvTableName
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.HonorStaticDTO>
     * @author: luomeng
     * @date: 2020/8/19 10:07
     */
    List<HonorStaticDTO> getHonorStatic(@Param("year") String year,
                                        @Param("honorType") String honorType,
                                        @Param("achvTableName") String achvTableName,
                                        @Param("limit") Integer limit,
                                        @Param("offset") Integer offset);

    /**
     * Description: 获奖统计(计数)
     *
     * @param year
     * @param honorType
     * @param achvTableName
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 15:16
     */
    Integer getHonorStaticCount(@Param("year") String year,
                                @Param("honorType") String honorType,
                                @Param("achvTableName") String achvTableName);

    /**
     * Description: 目标任务
     *
     * @param aimTableName
     * @param fourItemCode
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/19 15:05
     */
    List<ProjectIndicatorsDTO> getMissionTarget(@Param("aimTableName") String aimTableName,
                                                @Param("fourItemCode") String fourItemCode,
                                                @Param("limit") Integer limit,
                                                @Param("offset") Integer offset);

    /**
     * Description: 目标任务(计数)
     *
     * @param aimTableName
     * @param fourItemCode
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 15:23
     */
    Integer getMissionTargetCount(@Param("aimTableName") String aimTableName,
                                  @Param("fourItemCode") String fourItemCode);

    /**
     * Description: 贡献奖励得分
     *
     * @param contrbTableName
     * @param fourItemCode
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/19 15:05
     */
    List<ProjectIndicatorsDTO> getAwardScore(@Param("contrbTableName") String contrbTableName,
                                             @Param("fourItemCode") String fourItemCode,
                                             @Param("limit") Integer limit,
                                             @Param("offset") Integer offset);

    /**
     * Description: 贡献奖励得分(计数)
     *
     * @param contrbTableName
     * @param fourItemCode
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 15:25
     */
    Integer getAwardScoreCount(String contrbTableName, String fourItemCode);

    /**
     * Description: 负面扣减分值
     *
     * @param deductionTableName
     * @param fourItemCode
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/19 15:05
     */
    List<ProjectIndicatorsDTO> getDeductionMsg(@Param("deductionTableName") String deductionTableName,
                                               @Param("fourItemCode") String fourItemCode,
                                               @Param("limit") Integer limit,
                                               @Param("offset") Integer offset);

    /**
     * Description: 负面扣减分值(计数)
     *
     * @param deductionTableName
     * @param fourItemCode
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 15:25
     */
    Integer getDeductionMsgCount(String deductionTableName, String fourItemCode);
}