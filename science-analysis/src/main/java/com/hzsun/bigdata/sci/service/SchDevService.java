package com.hzsun.bigdata.sci.service;

import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: SchDevService
 * @Description: 学校发展概况接口
 * @Date: 2020/8/17 15:03
 */
public interface SchDevService {

    /**
     * Description: 各单位考核指标总体概况
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 15:04
     */
    RestResult generalAssess(String year);

    /**
     * Description: 各单位目标任务完成率统计
     *
     * @param year
     * @param unitClassNo 单位类别码
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 16:57
     */
    RestResult targetCompleteDraw(String year, String unitClassNo);

    /**
     * Description: 各单位贡献奖励统计
     *
     * @param year
     * @param unitClassNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/19 15:39
     */
    RestResult contrbAwardScoreDraw(String year, String unitClassNo);

    /**
     * Description: 各单位负面扣减分值统计
     *
     * @param year
     * @param unitClassNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/19 15:40
     */
    RestResult deductionScoreDraw(String year, String unitClassNo);

    /**
     * Description: 核心指标总体概况
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 16:58
     */
    RestResult generalCoreIndex(String year);

    /**
     * Description: 科研横向项目数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:05
     */
    RestResult countProjectHDraw(String year, Integer type);

    /**
     * Description: 科研纵向项目数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:05
     */
    RestResult countProjectVDraw(String year, Integer type);

    /**
     * Description: 科研成果数量统计
     *
     * @param year
     * @param type
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:08
     */
    RestResult sciAchievementDraw(String year, Integer type);

    /**
     * Description: 科研成果等级分布
     *
     * @param year
     * @param type 0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/21 13:49
     */
    RestResult sciLevelDraw(String year, Integer type);

    /**
     * Description: 科研经费金额统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:20
     */
    RestResult sciFeeDraw(String year, Integer type);

    /**
     * Description: 科研经费到位情况统计
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:20
     */
    RestResult sciFeeArriveDraw(String year);

    /**
     * Description: 获奖统计
     *
     * @param year
     * @param honorType -1 为全部
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:11
     */
    RestResult honorStatic(String year, String honorType, Integer page, Integer pageSize);

    /**
     * Description: 四大类项目指标总体概况
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param projectType  0:任务目标 1:贡献奖励得分 2:负面扣减分值
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:20
     */
    RestResult generalProjectIndicators(String year, String fourItemCode,
                                        Integer projectType, Integer page, Integer pageSize);


}
