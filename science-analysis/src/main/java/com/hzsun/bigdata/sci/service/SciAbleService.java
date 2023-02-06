package com.hzsun.bigdata.sci.service;

import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: SciAbleService
 * @Description: 科研能力横向对比接口
 * @Date: 2020/8/31 14:48
 */
public interface SciAbleService {
    /**
     * Description: 科研平台
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    RestResult sciPlatform(String year);

    /**
     * Description: 人才资源
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    RestResult humanSrc(String year);

    /**
     * Description: 对标同类型高校学科图表
     *
     * @param year
     * @param sciNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    RestResult subjCompareDraw(String year, String sciNo);

    /**
     * Description: 综合对比
     *
     * @param year
     * @param sciNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    RestResult fixCompare(String year, String sciNo);

    /**
     * Description: 其他学校明细
     *
     * @param year
     * @param sciNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    RestResult schDetail(String year, String sciNo, Integer page, Integer pageSize);
}
