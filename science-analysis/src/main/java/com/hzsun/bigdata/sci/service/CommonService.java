package com.hzsun.bigdata.sci.service;

import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: CommonService
 * @Description: 常用参数获取接口
 * @Date: 2020/8/18 8:59
 */
public interface CommonService {
    /**
     * Description: 获取单位列表
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/18 8:59
     */
    RestResult getUnit();

    /**
     * Description: 获取获奖类别
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/19 9:20
     */
    RestResult getWinRank();

    /**
     * Description: 获取学院列表
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 16:00
     */
    RestResult getCollege(String year);

    /**
     * Description: 获取课题类型
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 10:13
     */
    RestResult getItemClass(String year);

    /**
     * Description: 获取学科门类
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 14:30
     */
    RestResult getSubject();

    /**
     * Description: 获取一级学科信息
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/9/9 9:22
     */
    RestResult getPrimarySubject();

    /**
     * Description: 获取教师职称
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/26 9:33
     */
    RestResult getTechTitle();

    /**
     * Description: 模糊查询教师信息
     *
     * @param year
     * @param staffName
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/9/11 14:38
     */
    RestResult getTeachMsg(String year, String staffName);
}
