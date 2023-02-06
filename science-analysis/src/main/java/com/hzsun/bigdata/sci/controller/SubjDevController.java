package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.service.SubjDevService;
import com.hzsun.zbp.basic.config.ApiVersion;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author luomeng
 * @Classname: SubjectController
 * @Description: 学科发展概况
 * @Date: 2020-08-24 14:33
 */
@RequestMapping("/{version}/subjDev")
@ApiVersion(1)
@RestController
public class SubjDevController {

    @Autowired
    private SubjDevService subjDevService;

    /**
     * Description: 学科 核心指标总体概况
     *
     * @param response
     * @param year
     * @param subjNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 16:58
     */
    @GetMapping(value = "/generalCoreIndexBySubj/{year}/{subjNo}")
    public void generalCoreIndexBySubj(HttpServletResponse response,
                                       @PathVariable("year") String year,
                                       @PathVariable("subjNo") String subjNo) {
        RestResult restResult = subjDevService.generalCoreIndexBySubj(year, subjNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 科研横向项目数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:02
     */
    @GetMapping(value = "/countProjectHBySubjDraw/{year}/{type}/{subjNo}")
    public void countProjectHBySubjDraw(HttpServletResponse response,
                                        @PathVariable("year") String year,
                                        @PathVariable("type") Integer type,
                                        @PathVariable("subjNo") String subjNo) {
        RestResult restResult = subjDevService.countProjectHBySubjDraw(year, type, subjNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 科研纵向项目数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:02
     */
    @GetMapping(value = "/countProjectVBySubjDraw/{year}/{type}/{subjNo}")
    public void countProjectVBySubjDraw(HttpServletResponse response,
                                        @PathVariable("year") String year,
                                        @PathVariable("type") Integer type,
                                        @PathVariable("subjNo") String subjNo) {
        RestResult restResult = subjDevService.countProjectVBySubjDraw(year, type, subjNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 科研成果数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:10
     */
    @GetMapping(value = "/sciAchievementBySubjDraw/{year}/{type}/{subjNo}")
    public void sciAchievementBySubjDraw(HttpServletResponse response,
                                         @PathVariable("year") String year,
                                         @PathVariable("type") Integer type,
                                         @PathVariable("subjNo") String subjNo) {
        RestResult restResult = subjDevService.sciAchievementBySubjDraw(year, type, subjNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 科研成果等级分布
     *
     * @param response
     * @param year
     * @param type     0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param subjNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:12
     */
    @GetMapping(value = "/sciAchvLvBySubjDraw/{year}/{type}/{subjNo}")
    public void sciAchvLvBySubjDraw(HttpServletResponse response,
                                    @PathVariable("year") String year,
                                    @PathVariable("type") Integer type,
                                    @PathVariable("subjNo") String subjNo) {
        RestResult restResult = subjDevService.sciAchvLvBySubjDraw(year, type, subjNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 科研经费金额统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:17
     */
    @GetMapping(value = "/sciFeeBySubjDraw/{year}/{type}/{subjNo}")
    public void sciFeeBySubjDraw(HttpServletResponse response,
                                 @PathVariable("year") String year,
                                 @PathVariable("type") Integer type,
                                 @PathVariable("subjNo") String subjNo) {
        RestResult restResult = subjDevService.sciFeeBySubjDraw(year, type, subjNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 科研项目经费金额统计明细
     *
     * @param response
     * @param year
     * @param itemCode 课题类别
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/20 9:25
     */
    @GetMapping(value = "/sciFeeBySubjDetail/{year}/{itemCode}/{timeType}/{subjNo}/{page}/{pageSize}")
    public void sciFeeBySubjDetail(HttpServletResponse response,
                                   @PathVariable("year") String year,
                                   @PathVariable("itemCode") String itemCode,
                                   @PathVariable("timeType") Integer timeType,
                                   @PathVariable("subjNo") String subjNo,
                                   @PathVariable("page") Integer page,
                                   @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = subjDevService.sciFeeBySubjDetail(year, itemCode, timeType, subjNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科 获奖统计明细
     *
     * @param response
     * @param year
     * @param honorType -1 为全部
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:10
     */
    @GetMapping(value = "/honorStaticBySubj/{year}/{honorType}/{subjNo}/{page}/{pageSize}")
    public void honorStaticBySubj(HttpServletResponse response,
                                  @PathVariable("year") String year,
                                  @PathVariable("honorType") String honorType,
                                  @PathVariable("subjNo") String subjNo,
                                  @PathVariable("page") Integer page,
                                  @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = subjDevService.honorStaticBySubj(year, honorType, subjNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科投入产出总体概况
     *
     * @param response
     * @param year
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/24 17:36
     */
    @GetMapping(value = "/subjInOutPut/{year}/{timeType}/{subjNo}/{page}/{pageSize}")
    public void subjInOutPut(HttpServletResponse response,
                             @PathVariable("year") String year,
                             @PathVariable("timeType") Integer timeType,
                             @PathVariable("subjNo") String subjNo,
                             @PathVariable("page") Integer page,
                             @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = subjDevService.subjInOutPut(year, timeType, subjNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 人员投入产出概况
     *
     * @param response
     * @param year
     * @param staffNo  教师工号
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 9:43
     */
    @GetMapping(value = "/staffInOutMsg/{year}/{staffNo}")
    public void staffInOutMsg(HttpServletResponse response,
                              @PathVariable("year") String year,
                              @PathVariable("staffNo") String staffNo) {
        RestResult restResult = subjDevService.staffInOutMsg(year, staffNo);
        ResultResponse.genResult(response, restResult);
    }
}