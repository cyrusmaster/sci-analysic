package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.service.SpecialDevService;
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
 * @Classname: SpecialDevController
 * @Description: 专项发展概况
 * @Date: 2020-08-25 11:11
 */
@RequestMapping("/{version}/specialDev")
@ApiVersion(1)
@RestController
public class SpecialDevController {

    @Autowired
    private SpecialDevService specialDevService;

    /**
     * Description: 项目类别金额统计
     *
     * @param response
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 13:40
     */
    @GetMapping(value = "/itemClassFundStatic/{year}/{fourItemCode}/{type}")
    public void itemClassFundStatic(HttpServletResponse response,
                                    @PathVariable("year") String year,
                                    @PathVariable("fourItemCode") String fourItemCode,
                                    @PathVariable("type") Integer type) {
        RestResult restResult = specialDevService.itemClassFundStatic(year, fourItemCode, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 项目来源金额统计
     *
     * @param response
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 13:40
     */
    @GetMapping(value = "/itemFundSrcStatic/{year}/{fourItemCode}/{type}")
    public void itemFundSrcStatic(HttpServletResponse response,
                                  @PathVariable("year") String year,
                                  @PathVariable("fourItemCode") String fourItemCode,
                                  @PathVariable("type") Integer type) {
        RestResult restResult = specialDevService.itemFundSrcStatic(year, fourItemCode, type);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 论文指标统计
     *
     * @param response
     * @param year
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 15:11
     */
    @GetMapping(value = "/paperIndexStatic/{year}/{page}/{pageSize}")
    public void paperIndexStatic(HttpServletResponse response,
                                 @PathVariable("year") String year,
                                 @PathVariable("page") Integer page,
                                 @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = specialDevService.paperIndexStatic(year, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获奖列表
     *
     * @param response
     * @param year
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 15:11
     */
    @GetMapping(value = "/awardList/{year}/{page}/{pageSize}")
    public void awardList(HttpServletResponse response,
                          @PathVariable("year") String year,
                          @PathVariable("page") Integer page,
                          @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = specialDevService.awardList(year, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 平台基地列表
     *
     * @param response
     * @param year
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 15:11
     */
    @GetMapping(value = "/organBaseList/{year}/{page}/{pageSize}")
    public void organBaseList(HttpServletResponse response,
                              @PathVariable("year") String year,
                              @PathVariable("page") Integer page,
                              @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = specialDevService.organBaseList(year, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 成果转化列表
     *
     * @param response
     * @param year
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/25 15:11
     */
    @GetMapping(value = "/achvPatentList/{year}/{page}/{pageSize}")
    public void achvPatentList(HttpServletResponse response,
                               @PathVariable("year") String year,
                               @PathVariable("page") Integer page,
                               @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = specialDevService.achvPatentList(year, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }
}