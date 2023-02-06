package com.hzsun.bigdata.sci.model.qo;

import com.hzsun.zbp.basic.model.qo.PageQO;
import com.hzsun.zbp.basic.util.BaseUtils;
import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchQO
 * @Description: 科研查询QO
 * @Date: 2020-08-26 09:23
 */
@Data
public class SciSearchQO {
    /**
     * 起始时间 格式 yyyymmdd
     */
    private String startTime;
    /**
     * 截止时间 格式 yyyymmdd
     */
    private String endTime;
    /**
     * 学院
     */
    private String unitNo;
    /**
     * 学科
     */
    private String subject;
    /**
     * 项目大类 0.全部 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流
     */
    private Integer fourItemCode;
    /**
     * 项目类别 1.论文 2.项目 3.获奖 4.平台基地 5.专利 6.会议报告 7.著作
     */
    private Integer itemClass;
    /**
     * 教师职称
     */
    private String techTitle;
    /**
     * 页码
     */
    private Integer page;
    /**
     * 页数
     */
    private Integer pageSize;
    /**
     * 明细表名 后端处理
     */
    private String tableName;
    /**
     * 明细表名 后端处理
     */
    private String tableNameSecond;
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