package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: StaffItemFundDTO
 * @Description: 教职工项目经费信息DTO
 * @Date: 2020-08-25 09:28
 */
@Data
public class StaffItemFundDTO {

    /**
     * 项目编号
     */
    private String itemNo;
    /**
     * 项目名称
     */
    private String itemName;
    /**
     * 项目类型
     */
    private String itemType;
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
    private Double curArriveFund;

}