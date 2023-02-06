package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: StaffFundSrcDTO
 * @Description: 教职工项目来源经费信息DTO
 * @Date: 2020-08-25 09:34
 */
@Data
public class StaffFundSrcDTO {
    /**
     * 项目经费来源
     */
    private String itemFundSrcName;
    /**
     * 拨款数
     */
    private Double approFee;
}