package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchPatentDTO
 * @Description: 专利
 * @Date: 2020-08-26 11:00
 */
@Data
public class SciSearchPatentDTO {
    /**
     * 专利总数
     */
    private Integer totalPatentAchvNum;
    /**
     * 发明专利总数
     */
    private Integer inventPatentAchvNum;
    /**
     * 实用新型专利总数
     */
    private Integer unilModelPatentAchvNum;
    /**
     * PCT或国外专利总数
     */
    private Integer pctPatentAchvNum;

    /**
     * 专利成果名称
     */
    private String patentAchvName;
    /**
     * 单位名称
     */
    private String unitName;
    /**
     * 专利类型
     */
    private String patentTypeName;
    /**
     * 批准日期
     */
    private String apvDay;
    /**
     * 专利证书编号
     */
    private String patentCertNo;
    /**
     * 交纳专利年费日期
     */
    private String payPatentFeeDay;
    /**
     * 交纳金额
     */
    private Double payFee;
    /**
     * 授权公告日期
     */
    private String authAnncDay;
    /**
     * 申请名称
     */
    private String applyName;
    /**
     * 专利代理机构
     */
    private String patentAgencyOrgan;
    /**
     * 专利代理人
     */
    private String patentAgencyPsnl;
    /**
     * 专利权人
     */
    private String patenteeName;
    /**
     * 专利终止日期
     */
    private String patentEndDay;
    /**
     * 成果等级号
     */
    private String techAchvLvName;

    public SciSearchPatentDTO(){
        this.totalPatentAchvNum = 0;
        this.inventPatentAchvNum = 0;
        this.unilModelPatentAchvNum = 0;
        this.unilModelPatentAchvNum = 0;
    }
}