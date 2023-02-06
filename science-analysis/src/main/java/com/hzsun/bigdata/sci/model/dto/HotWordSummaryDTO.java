package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: HotWordSummaryDTO
 * @Description: 热词统计DTO
 * @Date: 2020-08-31 17:20
 */
@Data
public class HotWordSummaryDTO {
    /**
     * 检索文献数
     */
    private Integer searDocsNum;
    /**
     * 出现热点词汇数
     */
    private Integer hotWordNum;
    /**
     * 最热词汇
     */
    private String popularWord;
    /**
     * 出现次数
     */
    private Integer appearCnt;
    /**
     * 热度值
     */
    private Double hotValue;

    public HotWordSummaryDTO(){
        this.appearCnt = 0;
        this.hotValue = 0.0;
        this.hotWordNum = 0;
        this.popularWord = "";
        this.searDocsNum = 0;
    }
}