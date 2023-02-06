package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.model.qo.SciSearchQO;
import com.hzsun.bigdata.sci.service.SciSearchService;
import com.hzsun.zbp.basic.config.ApiVersion;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author luomeng
 * @Classname: SciInfoController
 * @Description: 科研信息查询
 * @Date: 2020-08-26 08:38
 */
@RequestMapping("/{version}/sciSearch")
@ApiVersion(1)
@RestController
public class SciSearchController {

    @Autowired
    private SciSearchService sciSearchService;

    /**
     * Description: 查询
     *
     * @param response
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 9:39
     */
    @PostMapping(value = "/search")
    public void search(HttpServletResponse response, @RequestBody SciSearchQO qo) {
        RestResult restResult = sciSearchService.search(qo);
        ResultResponse.genResult(response, restResult);
    }

}