package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.service.SchDevService;
import com.hzsun.zbp.basic.config.ApiVersion;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author luomeng
 * @Classname: SchDevController
 * @Description: 学校发展概况
 * @Date: 2020-08-17 14:48
 */
@RequestMapping("/{version}/schDev")
@ApiVersion(1)
@RestController
public class SchDevController {

    @Autowired
    private SchDevService schDevService;

    /**
     * Description: 各单位考核指标总体概况
     *
     * @param response
     * @return: void
     * @author: luomeng
     * @date: 2020/6/8 15:35
     */
    @GetMapping(value = "/generalAssess/{year}")
    public void generalAssess(HttpServletResponse response, @PathVariable("year") String year) {
        RestResult restResult = schDevService.generalAssess(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 各单位目标任务完成率统计
     *
     * @param response
     * @param year
     * @param unitClassNo 单位类别码
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 16:58
     */
    @GetMapping(value = "/targetCompleteDraw/{year}/{unitNo}")
    public void targetCompleteDraw(HttpServletResponse response, @PathVariable("year") String year,
                                   @PathVariable("unitNo") String unitClassNo) {
        RestResult restResult = schDevService.targetCompleteDraw(year, unitClassNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 各单位贡献奖励统计
     *
     * @param response
     * @param year
     * @param unitClassNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 15:38
     */
    @GetMapping(value = "/contrbAwardScoreDraw/{year}/{unitNo}")
    public void contrbAwardScoreDraw(HttpServletResponse response, @PathVariable("year") String year,
                                     @PathVariable("unitNo") String unitClassNo) {
        RestResult restResult = schDevService.contrbAwardScoreDraw(year, unitClassNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 各单位负面扣减分值统计
     *
     * @param response
     * @param year
     * @param unitClassNo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 15:38
     */
    @GetMapping(value = "/deductionScoreDraw/{year}/{unitNo}")
    public void deductionScoreDraw(HttpServletResponse response, @PathVariable("year") String year,
                                   @PathVariable("unitNo") String unitClassNo) {
        RestResult restResult = schDevService.deductionScoreDraw(year, unitClassNo);
        ResultResponse.genResult(response, restResult);
    }


    /**
     * Description: 核心指标总体概况
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 16:58
     */
    @GetMapping(value = "/generalCoreIndex/{year}")
    public void generalCoreIndex(HttpServletResponse response, @PathVariable("year") String year) {
        RestResult restResult = schDevService.generalCoreIndex(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 科研横向项目数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:02
     */
    @GetMapping(value = "/countProjectHDraw/{year}/{type}")
    public void countProjectHDraw(HttpServletResponse response, @PathVariable("year") String year
            , @PathVariable("type") Integer type) {
        RestResult restResult = schDevService.countProjectHDraw(year, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 科研纵向项目数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:03
     */
    @GetMapping(value = "/countProjectVDraw/{year}/{type}")
    public void countProjectVDraw(HttpServletResponse response, @PathVariable("year") String year,
                                  @PathVariable("type") Integer type) {
        RestResult restResult = schDevService.countProjectVDraw(year, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 科研成果数量统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:09
     */
    @GetMapping(value = "/sciAchievementDraw/{year}/{type}")
    public void sciAchievementDraw(HttpServletResponse response, @PathVariable("year") String year,
                                   @PathVariable("type") Integer type) {
        RestResult restResult = schDevService.sciAchievementDraw(year, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 科研成果等级分布
     *
     * @param response
     * @param year
     * @param type     0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @return: void
     * @author: luomeng
     * @date: 2020/8/21 13:48
     */
    @GetMapping(value = "/sciLevelDraw/{year}/{type}")
    public void sciLevelDraw(HttpServletResponse response, @PathVariable("year") String year,
                             @PathVariable("type") Integer type) {
        RestResult restResult = schDevService.sciLevelDraw(year, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 科研经费金额统计
     *
     * @param response
     * @param year
     * @param type     0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:17
     */
    @GetMapping(value = "/sciFeeDraw/{year}/{type}")
    public void sciFeeDraw(HttpServletResponse response, @PathVariable("year") String year,
                           @PathVariable("type") Integer type) {
        RestResult restResult = schDevService.sciFeeDraw(year, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 科研经费到位情况统计
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:19
     */
    @GetMapping(value = "/sciFeeArriveDraw/{year}")
    public void sciFeeArriveDraw(HttpServletResponse response, @PathVariable("year") String year) {
        RestResult restResult = schDevService.sciFeeArriveDraw(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获奖统计
     *
     * @param response
     * @param year
     * @param honorType -1 为全部
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:10
     */
    @GetMapping(value = "/honorStatic/{year}/{honorType}/{page}/{pageSize}")
    public void honorStatic(HttpServletResponse response,
                            @PathVariable("year") String year,
                            @PathVariable("honorType") String honorType,
                            @PathVariable("page") Integer page,
                            @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = schDevService.honorStatic(year, honorType, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 四大类项目指标总体概况
     *
     * @param response
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param projectType  0:任务目标 1:贡献奖励得分 2:负面扣减分值
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:14
     */
    @GetMapping(value = "/generalProjectIndicators/{year}/{fourItemCode}/{projectType}/{page}/{pageSize}")
    public void generalProjectIndicators(HttpServletResponse response,
                                         @PathVariable("year") String year,
                                         @PathVariable("fourItemCode") String fourItemCode,
                                         @PathVariable("projectType") Integer projectType,
                                         @PathVariable("page") Integer page,
                                         @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = schDevService.generalProjectIndicators(year, fourItemCode, projectType, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }
}