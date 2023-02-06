package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.service.CollegeDevService;
import com.hzsun.zbp.basic.config.ApiVersion;
import com.hzsun.zbp.basic.model.qo.PageQO;
import com.hzsun.zbp.basic.util.BaseUtils;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author luomeng
 * @Classname: CollegeDevController
 * @Description: 学院发展概况
 * @Date: 2020-08-17 14:49
 */
@RequestMapping("/{version}/collegeDev")
@ApiVersion(1)
@RestController
public class CollegeDevController {

    @Autowired
    private CollegeDevService collegeDevService;

    /**
     * Description: 学院 考核指标总体概况
     *
     * @param response
     * @param year
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:29
     */
    @GetMapping(value = "/generalAssess/{year}/{unitNo}")
    public void generalAssessByUnit(HttpServletResponse response,
                                    @PathVariable("year") String year,
                                    @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.generalAssessByUnit(year, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 目标任务完成率
     *
     * @param response
     * @param year
     * @param unitNo
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 17:29
     */
    @GetMapping(value = "/targetCompleteByUnitDraw/{year}/{unitNo}/{type}")
    public void targetCompleteByUnitDraw(HttpServletResponse response,
                                         @PathVariable("year") String year,
                                         @PathVariable("unitNo") String unitNo,
                                         @PathVariable("type") Integer type) {
        RestResult restResult = collegeDevService.targetCompleteByUnitDraw(year, unitNo, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 贡献奖励统计
     *
     * @param response
     * @param year
     * @param unitNo
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 17:30
     */
    @GetMapping(value = "/contrbAwardScoreByUnitDraw/{year}/{unitNo}/{type}")
    public void contrbAwardScoreByUnitDraw(HttpServletResponse response,
                                           @PathVariable("year") String year,
                                           @PathVariable("unitNo") String unitNo,
                                           @PathVariable("type") Integer type) {
        RestResult restResult = collegeDevService.contrbAwardScoreByUnitDraw(year, unitNo, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 负面扣减分值
     *
     * @param response
     * @param year
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 17:30
     */
    @GetMapping(value = "/deductionScoreByUnit/{year}/{unitNo}/{page}/{pageSize}")
    public void deductionScoreByUnit(HttpServletResponse response,
                                     @PathVariable("year") String year,
                                     @PathVariable("unitNo") String unitNo,
                                     @PathVariable("page") Integer page,
                                     @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = collegeDevService.deductionScoreByUnit(year, unitNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 核心指标总体概况
     *
     * @param response
     * @param year
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 16:58
     */
    @GetMapping(value = "/generalCoreIndexByUnit/{year}/{unitNo}")
    public void generalCoreIndexByUnit(HttpServletResponse response,
                                       @PathVariable("year") String year,
                                       @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.generalCoreIndexByUnit(year, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 科研横向项目数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:02
     */
    @GetMapping(value = "/countProjectHByUnitDraw/{year}/{type}/{unitNo}")
    public void countProjectHByUnitDraw(HttpServletResponse response,
                                        @PathVariable("year") String year,
                                        @PathVariable("type") Integer type,
                                        @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.countProjectHByUnitDraw(year, type, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 科研纵向项目数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:02
     */
    @GetMapping(value = "/countProjectVByUnitDraw/{year}/{type}/{unitNo}")
    public void countProjectVByUnitDraw(HttpServletResponse response,
                                        @PathVariable("year") String year,
                                        @PathVariable("type") Integer type,
                                        @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.countProjectVByUnitDraw(year, type, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 科研成果数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:10
     */
    @GetMapping(value = "/sciAchievementByUnitDraw/{year}/{type}/{unitNo}")
    public void sciAchievementByUnitDraw(HttpServletResponse response,
                                         @PathVariable("year") String year,
                                         @PathVariable("type") Integer type,
                                         @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.sciAchievementByUnitDraw(year, type, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 科研成果等级分布
     *
     * @param response
     * @param year
     * @param type     0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:12
     */
    @GetMapping(value = "/sciAchvLvByUnitDraw/{year}/{type}/{unitNo}")
    public void sciAchvLvByUnitDraw(HttpServletResponse response,
                                    @PathVariable("year") String year,
                                    @PathVariable("type") Integer type,
                                    @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.sciAchvLvByUnitDraw(year, type, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 科研经费金额统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:17
     */
    @GetMapping(value = "/sciFeeByUnitDraw/{year}/{type}/{unitNo}")
    public void sciFeeByUnitDraw(HttpServletResponse response,
                                 @PathVariable("year") String year,
                                 @PathVariable("type") Integer type,
                                 @PathVariable("unitNo") String unitNo) {
        RestResult restResult = collegeDevService.sciFeeByUnitDraw(year, type, unitNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 科研项目经费金额统计明细
     *
     * @param response
     * @param year
     * @param itemCode 课题类别
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param unitNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:25
     */
    @GetMapping(value = "/sciFeeByUnitDetail/{year}/{itemCode}/{timeType}/{unitNo}/{page}/{pageSize}")
    public void sciFeeByUnitDetail(HttpServletResponse response, HttpServletRequest request,
                                   @PathVariable("year") String year,
                                   @PathVariable("itemCode") String itemCode,
                                   @PathVariable("timeType") Integer timeType,
                                   @PathVariable("unitNo") String unitNo,
                                   @PathVariable("page") Integer page,
                                   @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = collegeDevService.sciFeeByUnitDetail(year, itemCode, timeType, unitNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 获奖统计明细
     *
     * @param response
     * @param year
     * @param honorType -1 为全部
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:10
     */
    @GetMapping(value = "/honorStaticByUnit/{year}/{honorType}/{unitNo}/{page}/{pageSize}")
    public void honorStaticByUnit(HttpServletResponse response,
                                  @PathVariable("year") String year,
                                  @PathVariable("honorType") String honorType,
                                  @PathVariable("unitNo") String unitNo,
                                  @PathVariable("page") Integer page,
                                  @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = collegeDevService.honorStaticByUnit(year, honorType, unitNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学院 四大类项目指标总体概况
     *
     * @param response
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param projectType  0:任务目标 1:贡献奖励得分 2:负面扣减分值
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:14
     */
    @GetMapping(value = "/generalProIndicatorsByUnit/{year}/{fourItemCode}/{projectType}/{unitNo}/{page}/{pageSize}")
    public void generalProIndicatorsByUnit(HttpServletResponse response,
                                           @PathVariable("year") String year,
                                           @PathVariable("fourItemCode") String fourItemCode,
                                           @PathVariable("projectType") Integer projectType,
                                           @PathVariable("unitNo") String unitNo,
                                           @PathVariable("page") Integer page,
                                           @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = collegeDevService.generalProIndicatorsByUnit(year, fourItemCode,
                projectType, unitNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }
}