package com.hzsun.bigdata.sci.service;

import com.hzsun.bigdata.sci.model.qo.SciSearchQO;
import com.hzsun.zbp.basic.util.RestResult;

/**
 * @author luomeng
 * @Classname: SciSearchService
 * @Description: 科研查询接口
 * @Date: 2020/8/26 8:40
 */
public interface SciSearchService {
    /**
     * Description: 查询
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/26 9:39
     */
    RestResult search(SciSearchQO qo);
}
