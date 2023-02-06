package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: HotPaperDTO
 * @Description: 学科前沿和热点论文
 * @Date: 2020-08-31 17:27
 */
@Data
public class HotPaperDTO {
    /**
     * 论文题目
     */
    private String paperName;
    /**
     * 所属学科
     */
    private String subjName;
    /**
     * 第一作者
     */
    private String firstAuthor;
    /**
     * 发表期刊
     */
    private String prdcName;
    /**
     * 发表时间
     */
    private String publDay;
    /**
     * 被引用次数
     */
    private Integer citeCnt;
}