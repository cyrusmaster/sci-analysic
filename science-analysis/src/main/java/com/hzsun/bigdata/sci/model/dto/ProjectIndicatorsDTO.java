package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: ProjectIndicatorsDTO
 * @Description: 四大类项目指标总体概况
 * @Date: 2020-08-19 11:03
 */
@Data
public class ProjectIndicatorsDTO {
    /**
     * 指标名称
     */
    private String indexName;
    /**
     * 所属一级指标
     */
    private String firstIndexName;
    /**
     * 目标任务值
     */
    private Integer aimMissionValue;
    /**
     * 权重
     */
    private Integer weightValue;
    /**
     * 完成情况
     */
    private Integer missionFinishValue;
    /**
     * 完成率
     */
    private Double finishRate;
    /**
     * 指标贡献奖励得分
     */
    private Integer awardScore;
    /**
     * 扣分指标号
     */
    private String deductionIndexNo;
    /**
     * 扣分指标名称
     */
    private String deductionIndexName;
    /**
     * 扣分次数
     */
    private Integer deductionCnt;
    /**
     * 扣分指标总分值
     */
    private Integer deductionIndexTotalScore;
    /**
     * 考核单位名称
     */
    private String evalUnitName;

}