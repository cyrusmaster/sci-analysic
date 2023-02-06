package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: OrganBaseListDTO
 * @Description: 平台基地列表DTO
 * @Date: 2020-08-25 15:30
 */
@Data
public class OrganBaseListDTO {
    /**
     * 负责人编号
     */
    private String chargePsnlStaffNo;
    /**
     * 负责人姓名
     */
    private String chargePsnlName;
    /**
     * 机构名称
     */
    private String organName;
    /**
     * 机构类型
     */
    private String organType;
    /**
     * 批准年月
     */
    private String apvMon;
    /**
     * 评估时间
     */
    private String prevEvalDay;
    /**
     * 评估结果
     */
    private String prevEvalResult;

}