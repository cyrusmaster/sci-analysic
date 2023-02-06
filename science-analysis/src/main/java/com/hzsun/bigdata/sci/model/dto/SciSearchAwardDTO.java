package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchAwardDTO
 * @Description: 获奖
 * @Date: 2020-08-26 10:58
 */
@Data
public class SciSearchAwardDTO {
    /**
     * 获奖总数
     */
    private Integer winAchvNum;
    /**
     * 国家级获奖总数
     */
    private Integer ctryWinAchvNum;
    /**
     * 国际级获奖总数
     */
    private Integer intlWinAchvNum;
    /**
     * 其他获奖总数
     */
    private Integer otherWinAchvNum;
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
     * 成果等级号
     */
    private String techAchvLvName;

    public SciSearchAwardDTO() {
        this.winAchvNum = 0;
        this.ctryWinAchvNum = 0;
        this.intlWinAchvNum = 0;
        this.otherWinAchvNum = 0;
    }
}