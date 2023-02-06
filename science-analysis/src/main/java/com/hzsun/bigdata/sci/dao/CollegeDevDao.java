package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.zbp.basic.model.DateArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: CollegeDevDao
 * @Description: 学院发展概况DAO
 * @Date: 2020/8/20 15:53
 */
@Repository
public interface CollegeDevDao {
    /**
     * Description: 学院 考核指标总体概况
     *
     * @param year
     * @param unitNo
     * @return: com.hzsun.bigdata.sci.model.dto.GeneralAssessDTO
     * @author: luomeng
     * @date: 2020/8/20 17:01
     */
    GeneralAssessDTO getGeneralAssessByUnit(@Param("year") String year, @Param("unitNo") String unitNo);

    /**
     * Description: 学院 目标任务完成率统计图表
     *
     * @param year
     * @param unitNo
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/20 17:07
     */
    List<DrawDTO> getCompleteByUnitDraw(@Param("year") String year, @Param("unitNo") String unitNo, @Param("type") Integer type);

    /**
     * Description: 学院 贡献奖励统计
     *
     * @param year
     * @param unitNo
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 9:57
     */
    List<DrawDTO> getAwardScoreByUnitDraw(@Param("year") String year, @Param("unitNo") String unitNo, @Param("type") Integer type);

    /**
     * Description: 学院 负面扣减分值
     *
     * @param deductionTableName 学院考核扣分信息表
     * @param unitNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/21 10:16
     */
    List<ProjectIndicatorsDTO> getDeductScoreByUnit(@Param("deductionTableName") String deductionTableName,
                                                    @Param("unitNo") String unitNo,
                                                    @Param("limit") Integer limit,
                                                    @Param("offset") Integer offset);

    /**
     * Description: 学院 负面扣减分值(计数)
     *
     * @param deductionTableName
     * @param unitNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 10:52
     */
    Integer getDeductScoreByUnitCount(@Param("deductionTableName") String deductionTableName,
                                      @Param("unitNo") String unitNo);

    /**
     * Description: 学院 核心指标总体概况
     *
     * @param year
     * @param unitNo
     * @return: com.hzsun.bigdata.sci.model.dto.GeneralCoreIndexDTO
     * @author: luomeng
     * @date: 2020/8/21 10:19
     */
    GeneralCoreIndexDTO getGeneralCoreIndexByUnit(@Param("year") String year, @Param("unitNo") String unitNo);

    /**
     * Description: 学院 科研横向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 10:56
     */
    List<DrawDTO> getCountProjectHByUnitDraw(@Param("year") String year, @Param("type") Integer type, @Param("unitNo") String unitNo);

    /**
     * Description: 学院 科研纵向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 10:56
     */
    List<DrawDTO> getCountProjectVByUnitDraw(@Param("year") String year, @Param("type") Integer type, @Param("unitNo") String unitNo);

    /**
     * Description: 学院 科研成果数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 13:58
     */
    List<DrawDTO> getSciAchievementByUnitDraw(@Param("year") String year, @Param("type") Integer type, @Param("unitNo") String unitNo);

    /**
     * Description:  学院 科研成果等级分布
     *
     * @param year
     * @param type   0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param unitNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 14:05
     */
    List<DrawDTO> getSciLevelByUnitDraw(@Param("year") String year, @Param("type") Integer type, @Param("unitNo") String unitNo);

    /**
     * Description: 学院 科研经费金额统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/21 17:26
     */
    List<DrawDTO> getSciFeeByUnitDraw(@Param("year") String year,
                                      @Param("type") Integer type,
                                      @Param("unitNo") String unitNo);

    /**
     * Description: 学院 科研项目经费金额统计明细
     *
     * @param fundTableName
     * @param itemCode
     * @param dateArea      时间范围
     * @param unitNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ItemFundDetailDTO>
     * @author: luomeng
     * @date: 2020/8/24 10:42
     */
    List<ItemFundDetailDTO> getSciFeeByUnitDetail(@Param("fundTableName") String fundTableName,
                                                  @Param("itemCode") String itemCode,
                                                  @Param("dateArea") DateArea dateArea,
                                                  @Param("unitNo") String unitNo,
                                                  @Param("limit") Integer limit,
                                                  @Param("offset") Integer offset);

    /**
     * Description: 学院 科研项目经费金额统计明细(计数)
     *
     * @param fundTableName
     * @param itemCode
     * @param dateArea
     * @param unitNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 15:54
     */
    Integer getSciFeeByUnitDetailCount(@Param("fundTableName") String fundTableName,
                                       @Param("itemCode") String itemCode,
                                       @Param("dateArea") DateArea dateArea,
                                       @Param("unitNo") String unitNo);

    /**
     * Description: 学院 获奖统计明细
     *
     * @param year
     * @param honorType
     * @param achvTableName
     * @param unitNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.HonorStaticDTO>
     * @author: luomeng
     * @date: 2020/8/24 8:52
     */
    List<HonorStaticDTO> getHonorStaticByUnit(@Param("year") String year,
                                              @Param("honorType") String honorType,
                                              @Param("achvTableName") String achvTableName,
                                              @Param("unitNo") String unitNo,
                                              @Param("limit") Integer limit,
                                              @Param("offset") Integer offset);

    /**
     * Description: 学院 获奖统计明细(计数)
     *
     * @param year
     * @param honorType
     * @param achvTableName
     * @param unitNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 9:58
     */
    Integer getHonorStaticByUnitCount(@Param("year") String year,
                                      @Param("honorType") String honorType,
                                      @Param("achvTableName") String achvTableName,
                                      @Param("unitNo") String unitNo);

    /**
     * Description: 学院 目标任务
     *
     * @param aimTableName
     * @param fourItemCode
     * @param unitNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/24 8:59
     */
    List<ProjectIndicatorsDTO> getMissionTargetByUnit(@Param("aimTableName") String aimTableName,
                                                      @Param("fourItemCode") String fourItemCode,
                                                      @Param("unitNo") String unitNo,
                                                      @Param("limit") Integer limit,
                                                      @Param("offset") Integer offset);

    /**
     * Description: 学院 目标任务(计数)
     *
     * @param aimTableName
     * @param fourItemCode
     * @param unitNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 10:38
     */
    Integer getMissionTargetByUnitCount(@Param("aimTableName") String aimTableName,
                                        @Param("fourItemCode") String fourItemCode,
                                        @Param("unitNo") String unitNo);

    /**
     * Description: 学院 贡献得分
     *
     * @param contrbTableName
     * @param fourItemCode
     * @param unitNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/24 8:59
     */
    List<ProjectIndicatorsDTO> getAwardScoreByUnit(@Param("contrbTableName") String contrbTableName,
                                                   @Param("fourItemCode") String fourItemCode,
                                                   @Param("unitNo") String unitNo,
                                                   @Param("limit") Integer limit,
                                                   @Param("offset") Integer offset);

    /**
     * Description: 学院 贡献得分(计数)
     *
     * @param contrbTableName
     * @param fourItemCode
     * @param unitNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 10:39
     */
    Integer getAwardScoreByUnitCount(@Param("contrbTableName") String contrbTableName,
                                     @Param("fourItemCode") String fourItemCode,
                                     @Param("unitNo") String unitNo);

    /**
     * Description: 学院 考核扣分
     *
     * @param deductionTableName
     * @param fourItemCode
     * @param unitNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ProjectIndicatorsDTO>
     * @author: luomeng
     * @date: 2020/8/24 9:00
     */
    List<ProjectIndicatorsDTO> getDeductionMsgByUnit(@Param("deductionTableName") String deductionTableName,
                                                     @Param("fourItemCode") String fourItemCode,
                                                     @Param("unitNo") String unitNo,
                                                     @Param("limit") Integer limit,
                                                     @Param("offset") Integer offset);

    /**
     * Description: 学院 考核扣分(计数)
     *
     * @param deductionTableName
     * @param fourItemCode
     * @param unitNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 10:39
     */
    Integer getDeductionMsgByUnitCount(@Param("deductionTableName") String deductionTableName,
                                       @Param("fourItemCode") String fourItemCode,
                                       @Param("unitNo") String unitNo);
}
