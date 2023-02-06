package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.zbp.basic.model.DateArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: SubjDevDao
 * @Description: 学科发展概况dao
 * @Date: 2020/8/24 16:05
 */
@Repository
public interface SubjDevDao {
    /**
     * Description: 学科 核心指标总体概况
     *
     * @param year
     * @param subjNo
     * @return: com.hzsun.bigdata.sci.model.dto.GeneralCoreIndexDTO
     * @author: luomeng
     * @date: 2020/8/24 16:32
     */
    GeneralCoreIndexDTO getGeneralCoreIndexBySubj(@Param("year") String year,
                                                  @Param("subjNo") String subjNo);

    /**
     * Description: 学科 科研横向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/24 16:32
     */
    List<DrawDTO> getCountProjectHBySubjDraw(@Param("year") String year,
                                             @Param("type") Integer type,
                                             @Param("subjNo") String subjNo);

    /**
     * Description: 学科 科研纵向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/24 16:33
     */
    List<DrawDTO> getCountProjectVBySubjDraw(@Param("year") String year,
                                             @Param("type") Integer type,
                                             @Param("subjNo") String subjNo);

    /**
     * Description: 学科 科研成果数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/24 16:33
     */
    List<DrawDTO> getSciAchievementBySubjDraw(@Param("year") String year,
                                              @Param("type") Integer type,
                                              @Param("subjNo") String subjNo);

    /**
     * Description: 学科 科研成果等级分布
     *
     * @param year
     * @param type   0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param subjNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/24 16:33
     */
    List<DrawDTO> getSciLevelBySubjDraw(@Param("year") String year,
                                        @Param("type") Integer type,
                                        @Param("subjNo") String subjNo);

    /**
     * Description:  学科 科研经费金额统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/24 16:33
     */
    List<DrawDTO> getSciFeeBySubjDraw(@Param("year") String year,
                                      @Param("type") Integer type,
                                      @Param("subjNo") String subjNo);

    /**
     * Description: 学科 科研项目经费金额统计明细
     *
     * @param fundTableName
     * @param itemCode
     * @param dateArea      时间范围
     * @param subjNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.ItemFundDetailDTO>
     * @author: luomeng
     * @date: 2020/8/24 17:30
     */
    List<ItemFundDetailDTO> getSciFeeBySubjDetail(@Param("fundTableName") String fundTableName,
                                                  @Param("itemCode") String itemCode,
                                                  @Param("dateArea") DateArea dateArea,
                                                  @Param("subjNo") String subjNo,
                                                  @Param("limit") Integer limit,
                                                  @Param("offset") Integer offset);

    /**
     * Description: 学科 科研项目经费金额统计明细(计数)
     *
     * @param fundTableName
     * @param itemCode
     * @param dateArea
     * @param subjNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/7 10:11
     */
    Integer getSciFeeBySubjDetailCount(@Param("fundTableName") String fundTableName,
                                       @Param("itemCode") String itemCode,
                                       @Param("dateArea") DateArea dateArea,
                                       @Param("subjNo") String subjNo);

    /**
     * Description: 学科 获奖统计明细
     *
     * @param year
     * @param honorType
     * @param achvTableName
     * @param subjNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.HonorStaticDTO>
     * @author: luomeng
     * @date: 2020/8/24 17:23
     */
    List<HonorStaticDTO> getHonorStaticBySubj(@Param("year") String year,
                                              @Param("honorType") String honorType,
                                              @Param("achvTableName") String achvTableName,
                                              @Param("subjNo") String subjNo,
                                              @Param("limit") Integer limit,
                                              @Param("offset") Integer offset);

    /**
     * Description: 学科 获奖统计明细(计数)
     *
     * @param year
     * @param honorType
     * @param achvTableName
     * @param subjNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/3 10:21
     */
    Integer getHonorStaticBySubjCount(@Param("year") String year,
                                      @Param("honorType") String honorType,
                                      @Param("achvTableName") String achvTableName,
                                      @Param("subjNo") String subjNo);

    /**
     * Description: 学科 投入产出总体概况
     *
     * @param year
     * @param monthList 月份列表
     * @param subjNo
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SubjInOutPutDTO>
     * @author: luomeng
     * @date: 2020/8/24 17:44
     */
    List<SubjInOutPutDTO> getSubjInOutPut(@Param("year") String year,
                                          @Param("monthList") List<String> monthList,
                                          @Param("subjNo") String subjNo,
                                          @Param("limit") Integer limit,
                                          @Param("offset") Integer offset);

    /**
     * Description: 学科 投入产出总体概况(计数)
     *
     * @param year
     * @param monthList
     * @param subjNo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/7 11:06
     */
    Integer getSubjInOutPutCount(@Param("year") String year,
                                 @Param("monthList") List<String> monthList,
                                 @Param("subjNo") String subjNo);

    /**
     * Description: 教职工成果产出信息
     *
     * @param staffOutTable
     * @param staffNo
     * @return: com.hzsun.bigdata.sci.model.dto.StaffOutPutInfoDTO
     * @author: luomeng
     * @date: 2020/8/25 10:15
     */
    StaffOutPutInfoDTO getStaffOutPutInfo(@Param("staffOutTable") String staffOutTable,
                                          @Param("staffNo") String staffNo);

    /**
     * Description: 教职工项目经费信息
     *
     * @param staffItemFundTable
     * @param staffNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.StaffItemFundDTO>
     * @author: luomeng
     * @date: 2020/8/25 10:16
     */
    List<StaffItemFundDTO> getItemFundList(@Param("staffItemFundTable") String staffItemFundTable,
                                           @Param("staffNo") String staffNo);

    /**
     * Description: 教职工项目来源经费信息
     *
     * @param staffFundSrcTable
     * @param staffNo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.StaffFundSrcDTO>
     * @author: luomeng
     * @date: 2020/8/25 10:16
     */
    List<StaffFundSrcDTO> getFundSrcList(@Param("staffFundSrcTable") String staffFundSrcTable,
                                         @Param("staffNo") String staffNo);
}
