package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: AchvPatentListDTO
 * @Description: 成果转化列表
 * @Date: 2020-08-25 15:30
 */
@Data
public class AchvPatentListDTO {
    /**
     * 专利成果编号
     */
    private String patentAchvNo;
    /**
     * 专利成果名称
     */
    private String patentAchvName;
    /**
     * 单位名称
     */
    private String unitName;
    /**
     * 专利类型码
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
    private String payFee;
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
    /**
     * 四大项目码
     */
    private String fourItemName;
    /**
     * 出售日期
     */
    private String saleDate;
    /**
     * 出售金额
     */
    private Double saleMoney;
    /**
     * 受售单位
     */
    private String saleUnit;
    /**
     * 本年实际收入
     */
    private Double curYaerActulIncome;
}