package com.hzsun.bigdata.sci.service;

import com.hzsun.bigdata.sci.model.qo.SubjDynamicQO;
import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: SubjDynamicService
 * @Description: 学科动态接口
 * @Date: 2020/8/31 14:54
 */
public interface SubjDynamicService {
    /**
     * Description: 研究热点词汇统计
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:18
     */
    RestResult hotWordSummary(SubjDynamicQO qo);

    /**
     * Description: 热点词汇详情
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:18
     */
    RestResult hotWordList(SubjDynamicQO qo);

    /**
     * Description: 热词趋势图表
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:18
     */
    RestResult hotWordTrendDraw(SubjDynamicQO qo);

    /**
     * Description: 学科前沿和热点论文
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:19
     */
    RestResult hotPaperDetail(SubjDynamicQO qo);
}
