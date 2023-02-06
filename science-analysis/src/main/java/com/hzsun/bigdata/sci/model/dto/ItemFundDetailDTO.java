package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: ItemFundDetailDTO
 * @Description: 科研项目经费金额统计
 * @Date: 2020-08-24 10:29
 */
@Data
public class ItemFundDetailDTO {
    /**
     * 项目编号
     */
    private String itemNo;
    /**
     * 项目名称
     */
    private String itemName;
    /**
     * 开始时间
     */
    private String startDay;
    /**
     * 结束时间
     */
    private String endDay;
    /**
     * 负责人
     */
    private String itemLeaderStaffName;
    /**
     * 项目类型名称
     */
    private String itemClassName;
    /**
     * 项目等级
     */
    private String itemRank;
    /**
     * 计划经费总额
     */
    private Double planFundTotalFee;
    /**
     * 当前到账经费
     */
    private Double curAcctFundFee;
}