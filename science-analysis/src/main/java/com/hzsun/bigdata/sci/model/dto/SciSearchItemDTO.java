package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchItemDTO
 * @Description: 项目
 * @Date: 2020-08-26 10:58
 */
@Data
public class SciSearchItemDTO {
    /**
     * 项目总数
     */
    private Integer totalItemNum;
    /**
     * 横向项目总数
     */
    private Integer totalHItemNum;
    /**
     * 纵向项目总数
     */
    private Integer totalVItemNum;
    /**
     * 项目名称
     */
    private String itemName;
    /**
     * 项目开始时间
     */
    private String startDay;
    /**
     * 项目截止时间
     */
    private String endDay;
    /**
     * 负责人
     */
    private String leaderName;
    /**
     * 项目级别名称
     */
    private String itemRank;
    /**
     * 项目类别名称
     */
    private String itemClassName;
    /**
     * 项目经费来源名称
     */
    private String fundSrcName;
    /**
     * 计划经费总额
     */
    private String fundTotalFee;
    /**
     * 当前到账经费
     */
    private String curFundFee;

    public SciSearchItemDTO() {
        this.totalItemNum = 0;
        this.totalHItemNum = 0;
        this.totalVItemNum = 0;
    }
}