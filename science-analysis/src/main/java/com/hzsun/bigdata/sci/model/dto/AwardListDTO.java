package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: AwardListDTO
 * @Description: 获奖列表
 * @Date: 2020-08-25 15:29
 */
@Data
public class AwardListDTO {
    /**
     * 获奖成果编号
     */
    private String winAchvNo;
    /**
     * 获奖成果名称
     */
    private String winAchvName;
    /**
     * 项目来源名称
     */
    private String itemSrcName;
    /**
     * 单位名称
     */
    private String unitName;
    /**
     * 获奖日期
     */
    private String winDate;
    /**
     * 成果获奖类别名称
     */
    private String winAchvClsName;
    /**
     * 科技奖类别名称
     */
    private String techWinAchvClsName;
    /**
     * 奖励等级名称
     */
    private String awrdLvName;
    /**
     * 获奖级别名称
     */
    private String winRankName;
    /**
     * 颁奖单位
     */
    private String grantAwrdUnit;
    /**
     * 单位排名
     */
    private String unitRank;
    /**
     * 负责人排名
     */
    private String chargePnslRank;
    /**
     * 作者姓名
     */
    private String autherName;
    /**
     * 一级学科名称
     */
    private String subjClassName;
    /**
     * 成果等级
     */
    private String techAchvLvName;
    /**
     * 四大项目
     */
    private String fourItemName;


}