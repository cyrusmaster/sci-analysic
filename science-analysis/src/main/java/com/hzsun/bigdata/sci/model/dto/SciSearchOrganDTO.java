package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchOrganDTO
 * @Description: 平台基地
 * @Date: 2020-08-26 10:59
 */
@Data
public class SciSearchOrganDTO {
    /**
     * 机构总数
     */
    private Integer totalOrganNum;
    /**
     * 基础研究机构总数
     */
    private Integer baseRescOrganNum;
    /**
     * 基础研究机构总数
     */
    private Integer appRescOrganNum;
    /**
     * 理论研究机构总数
     */
    private Integer theoryRescOrganNum;

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
    private String organTypeName;
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

    public SciSearchOrganDTO() {
        this.totalOrganNum = 0;
        this.baseRescOrganNum = 0;
        this.appRescOrganNum = 0;
        this.theoryRescOrganNum = 0;
    }
}