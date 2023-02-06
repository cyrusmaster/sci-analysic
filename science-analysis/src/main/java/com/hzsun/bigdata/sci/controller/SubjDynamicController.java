package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.model.qo.SubjDynamicQO;
import com.hzsun.bigdata.sci.service.SubjDynamicService;
import com.hzsun.zbp.basic.config.ApiVersion;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author luomeng
 * @Classname: SubjDynamicController
 * @Description: 学科动态
 * @Date: 2020-08-31 14:53
 */
@RequestMapping("/{version}/subjDynamic")
@ApiVersion(1)
@RestController
public class SubjDynamicController {

    @Autowired
    private SubjDynamicService subjDynamicService;

    /**
     * Description: 研究热点词汇统计
     *
     * @param response
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 17:17
     */
    @PostMapping(value = "/hotWordSummary")
    public void hotWordSummary(HttpServletResponse response, @RequestBody SubjDynamicQO qo) {
        RestResult restResult = subjDynamicService.hotWordSummary(qo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 热点词汇详情
     *
     * @param response
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 17:17
     */
    @PostMapping(value = "/hotWordList")
    public void hotWordList(HttpServletResponse response, @RequestBody SubjDynamicQO qo) {
        RestResult restResult = subjDynamicService.hotWordList(qo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 热词趋势图表
     *
     * @param response
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 17:17
     */
    @PostMapping(value = "/hotWordTrendDraw")
    public void hotWordTrendDraw(HttpServletResponse response, @RequestBody SubjDynamicQO qo) {
        RestResult restResult = subjDynamicService.hotWordTrendDraw(qo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 学科前沿和热点论文
     *
     * @param response
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 17:17
     */
    @PostMapping(value = "/hotPaperDetail")
    public void hotPaperDetail(HttpServletResponse response, @RequestBody SubjDynamicQO qo) {
        RestResult restResult = subjDynamicService.hotPaperDetail(qo);
        ResultResponse.genResult(response, restResult);
    }
}