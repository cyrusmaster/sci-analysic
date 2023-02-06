package com.hzsun.bigdata.sci.model.qo;

import com.hzsun.zbp.basic.util.BaseUtils;
import lombok.Data;

/**
 * @author luomeng
 * @Classname: SubjDynamicQO
 * @Description: 学科动态QO
 * @Date: 2020-08-31 17:11
 */
@Data
public class SubjDynamicQO {
    /**
     * 年份
     */
    private String year;
    /**
     * 一级学科代码
     */
    private String subjClassCode;
    /**
     * 学科领域代码
     */
    private String subjFiledCode;
    /**
     * 语言类型 1、中文 2、英文
     */
    private String langClass;
    /**
     * 热点词汇
     */
    private String hotWord;
    /**
     * 页码
     */
    private Integer page;
    /**
     * 页数
     */
    private Integer pageSize;
    /**
     * 起始条数 后端处理
     */
    private Integer limit;
    /**
     * 截止条数 后端处理
     */
    private Integer offset;

    public void init() {
        page = BaseUtils.isNull(page) || page <= 0 ? 1 : page;
        pageSize = BaseUtils.isNull(pageSize) || pageSize <= 0 ? 20 : pageSize;
        // Mysql分页Limit
        limit = (page - 1) * pageSize;
        offset = pageSize;
    }
}