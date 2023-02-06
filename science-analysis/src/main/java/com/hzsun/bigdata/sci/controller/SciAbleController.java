package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.service.SciAbleService;
import com.hzsun.zbp.basic.config.ApiVersion;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author luomeng
 * @Classname: SciAbleController
 * @Description: 科研能力横向对比
 * @Date: 2020-08-31 14:44
 */
@RequestMapping("/{version}/sciAble")
@ApiVersion(1)
@RestController
public class SciAbleController {

    @Autowired
    private SciAbleService sciAbleService;

    /**
     * Description: 科研平台
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 15:28
     */
    @GetMapping(value = "/sciPlatform/{year}")
    public void sciPlatform(HttpServletResponse response, @PathVariable String year) {
        RestResult restResult = sciAbleService.sciPlatform(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 人才资源
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 15:28
     */
    @GetMapping(value = "/humanSrc/{year}")
    public void humanSrc(HttpServletResponse response, @PathVariable("year") String year) {
        RestResult restResult = sciAbleService.humanSrc(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 对标同类型高校学科图表
     *
     * @param response
     * @param year
     * @param sciNo    学科类型
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 15:28
     */
    @GetMapping(value = "/subjCompareDraw/{year}/{sciNo}")
    public void subjCompareDraw(HttpServletResponse response, @PathVariable("year") String year,
                                @PathVariable("sciNo") String sciNo) {
        RestResult restResult = sciAbleService.subjCompareDraw(year, sciNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 综合对比
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 15:28
     */
    @GetMapping(value = "/fixCompare/{year}/{sciNo}")
    public void fixCompare(HttpServletResponse response, @PathVariable("year") String year,
                           @PathVariable("sciNo") String sciNo) {
        RestResult restResult = sciAbleService.fixCompare(year, sciNo);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 其他学校明细
     *
     * @param response
     * @param year
     * @param sciNo
     * @param page
     * @param pageSize
     * @return: void
     * @author: luomeng
     * @date: 2020/8/31 15:28
     */
    @GetMapping(value = "/schDetail/{year}/{sciNo}/{page}/{pageSize}")
    public void schDetail(HttpServletResponse response,
                          @PathVariable("year") String year,
                          @PathVariable("sciNo") String sciNo,
                          @PathVariable("page") Integer page,
                          @PathVariable("pageSize") Integer pageSize) {
        RestResult restResult = sciAbleService.schDetail(year, sciNo, page, pageSize);
        ResultResponse.genResult(response, restResult);
    }
}