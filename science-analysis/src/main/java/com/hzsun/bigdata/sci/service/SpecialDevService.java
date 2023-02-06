package com.hzsun.bigdata.sci.service;

import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: SpecialDevService
 * @Description: 专项发展概况接口
 * @Date: 2020/8/25 11:12
 */
public interface SpecialDevService {

    /**
     * Description: 项目类别金额统计
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 13:41
     */
    RestResult itemClassFundStatic(String year, String fourItemCode, Integer type);

    /**
     * Description: 项目来源金额统计
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 13:42
     */
    RestResult itemFundSrcStatic(String year, String fourItemCode, Integer type);

    /**
     * Description: 论文指标统计
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:14
     */
    RestResult paperIndexStatic(String year, Integer page, Integer pageSize);

    /**
     * Description: 获奖列表
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:15
     */
    RestResult awardList(String year, Integer page, Integer pageSize);

    /**
     * Description: 平台基地列表
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:15
     */
    RestResult organBaseList(String year, Integer page, Integer pageSize);

    /**
     * Description: 成果转化列表
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:15
     */
    RestResult achvPatentList(String year, Integer page, Integer pageSize);
}
