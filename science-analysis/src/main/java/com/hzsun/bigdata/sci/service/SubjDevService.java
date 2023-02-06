package com.hzsun.bigdata.sci.service;

import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: SubjectService
 * @Description: 学科发展概况接口
 * @Date: 2020/8/24 14:43
 */
public interface SubjDevService {
    /**
     * Description: 学科 核心指标总体概况
     *
     * @param year
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:06
     */
    RestResult generalCoreIndexBySubj(String year, String subjNo);

    /**
     * Description: 学科 科研横向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:06
     */
    RestResult countProjectHBySubjDraw(String year, Integer type, String subjNo);

    /**
     * Description: 学科 科研纵向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:06
     */
    RestResult countProjectVBySubjDraw(String year, Integer type, String subjNo);

    /**
     * Description: 学科 科研成果数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    RestResult sciAchievementBySubjDraw(String year, Integer type, String subjNo);

    /**
     * Description: 学科 科研成果等级分布
     *
     * @param year
     * @param type   0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    RestResult sciAchvLvBySubjDraw(String year, Integer type, String subjNo);

    /**
     * Description: 学科 科研经费金额统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    RestResult sciFeeBySubjDraw(String year, Integer type, String subjNo);

    /**
     * Description: 学科 科研项目经费金额统计明细
     *
     * @param year
     * @param itemCode 课题类别
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    RestResult sciFeeBySubjDetail(String year, String itemCode, Integer timeType,
                                  String subjNo, Integer page, Integer pageSize);

    /**
     * Description: 学科 获奖统计明细
     *
     * @param year
     * @param honorType -1 为全部
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    RestResult honorStaticBySubj(String year, String honorType, String subjNo, Integer page, Integer pageSize);

    /**
     * Description: 学科投入产出总体概况
     *
     * @param year
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 17:37
     */
    RestResult subjInOutPut(String year, Integer timeType, String subjNo, Integer page, Integer pageSize);

    /**
     * Description:  人员投入产出概况
     *
     * @param year
     * @param staffNo 教师工号
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 9:44
     */
    RestResult staffInOutMsg(String year, String staffNo);
}
