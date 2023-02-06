package com.hzsun.bigdata.sci.service;

import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: CollegeDevService
 * @Description: 学院发展概况接口
 * @Date: 2020/8/19 17:03
 */
public interface CollegeDevService {
    /**
     * Description: 学院 考核指标总体概况
     *
     * @param year
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:35
     */
    RestResult generalAssessByUnit(String year, String unitNo);

    /**
     * Description:  学院 目标任务完成率
     *
     * @param year
     * @param unitNo
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:35
     */
    RestResult targetCompleteByUnitDraw(String year, String unitNo, Integer type);

    /**
     * Description: 学院 贡献奖励统计
     *
     * @param year
     * @param unitNo
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    RestResult contrbAwardScoreByUnitDraw(String year, String unitNo, Integer type);

    /**
     * Description:  学院 负面扣减分值
     *
     * @param year
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    RestResult deductionScoreByUnit(String year, String unitNo, Integer page, Integer pageSize);

    /**
     * Description: 学院 核心指标总体概况
     *
     * @param year
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    RestResult generalCoreIndexByUnit(String year, String unitNo);

    /**
     * Description:  学院 科研横向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    RestResult countProjectHByUnitDraw(String year, Integer type, String unitNo);

    /**
     * Description: 学院 科研纵向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:37
     */
    RestResult countProjectVByUnitDraw(String year, Integer type, String unitNo);

    /**
     * Description: 学院 科研成果数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:37
     */
    RestResult sciAchievementByUnitDraw(String year, Integer type, String unitNo);

    /**
     * Description: 学院 科研成果等级分布
     *
     * @param year
     * @param type   0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    RestResult sciAchvLvByUnitDraw(String year, Integer type, String unitNo);

    /**
     * Description: 学院 科研经费金额统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    RestResult sciFeeByUnitDraw(String year, Integer type, String unitNo);

    /**
     * Description: 学院 科研项目经费金额统计明细
     *
     * @param year
     * @param itemCode 课题类别
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    RestResult sciFeeByUnitDetail(String year, String itemCode, Integer timeType, String unitNo,
                                  Integer page, Integer pageSize);

    /**
     * Description: 学院 获奖统计明细
     *
     * @param year
     * @param honorType 空为全部
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    RestResult honorStaticByUnit(String year, String honorType, String unitNo, Integer page, Integer pageSize);

    /**
     * Description: 学院 四大类项目指标总体概况
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param projectType  0:任务目标 1:贡献奖励得分 2:负面扣减分值
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:32
     */
    RestResult generalProIndicatorsByUnit(String year, String fourItemCode, Integer projectType, String unitNo,
                                          Integer page, Integer pageSize);
}
