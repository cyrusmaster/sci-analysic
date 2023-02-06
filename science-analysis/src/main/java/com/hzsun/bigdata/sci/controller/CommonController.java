package com.hzsun.bigdata.sci.controller;

import com.hzsun.bigdata.sci.service.CommonService;
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
 * @Classname: CommonController
 * @Description: 常用参数获取控制器
 * @Date: 2020-08-17 10:31
 */
@RequestMapping("/{version}/common")
@ApiVersion(1)
@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    /**
     * Description: 获取单位列表
     *
     * @param response
     * @return: void
     * @author: luomeng
     * @date: 2020/8/17 17:14
     */
    @GetMapping(value = "/getUnit")
    public void getUnit(HttpServletResponse response) {
        RestResult restResult = commonService.getUnit();
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获取获奖类别（国家自然科学奖等....）
     *
     * @param response
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 9:19
     */
    @GetMapping(value = "/getWinRank")
    public void getWinRank(HttpServletResponse response) {
        RestResult restResult = commonService.getWinRank();
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获取学院列表
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/19 9:19
     */
    @GetMapping(value = "/getCollege/{year}")
    public void getCollege(HttpServletResponse response, @PathVariable("year") String year) {
        RestResult restResult = commonService.getCollege(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获取课题类型
     *
     * @param response
     * @param year
     * @return: void
     * @author: luomeng
     * @date: 2020/8/24 10:12
     */
    @GetMapping(value = "/getItemClass/{year}")
    public void getItemClass(HttpServletResponse response, @PathVariable("year") String year) {
        RestResult restResult = commonService.getItemClass(year);
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获取学科门类
     *
     * @return: void
     * @author: luomeng
     * @date: 2020/8/24 14:30
     */
    @GetMapping(value = "/getSubject")
    public void getSubject(HttpServletResponse response) {
        RestResult restResult = commonService.getSubject();
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获取一级学科
     *
     * @param response
     * @return: void
     * @author: luomeng
     * @date: 2020/9/9 9:45
     */
    @GetMapping(value = "/getPrimarySubject")
    public void getPrimarySubject(HttpServletResponse response) {
        RestResult restResult = commonService.getPrimarySubject();
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 获取教师职称
     *
     * @param response
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 9:33
     */
    @GetMapping(value = "/getTechTitle")
    public void getTechTitle(HttpServletResponse response) {
        RestResult restResult = commonService.getTechTitle();
        ResultResponse.genResult(response, restResult);
    }

    /**
     * Description: 模糊查询教师信息
     *
     * @param response
     * @param staffName
     * @return: void
     * @author: luomeng
     * @date: 2020/9/11 14:36
     */
    @GetMapping(value = "/getTeachMsg/{year}/{staffName}")
    public void getTeachMsg(HttpServletResponse response,
                            @PathVariable("year") String year,
                            @PathVariable("staffName") String staffName) {
        RestResult restResult = commonService.getTeachMsg(year, staffName);
        ResultResponse.genResult(response, restResult);
    }
}