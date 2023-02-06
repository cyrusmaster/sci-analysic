package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: GeneralAssessDTO
 * @Description: 考核指标总体概况
 * @Date: 2020-08-17 17:26
 */
@Data
public class GeneralAssessDTO {
    /**
     * 任务平均完成率
     */
    private String missionAvgFinishRate;
    /**
     * 贡献奖励总得分
     */
    private Integer contributeAwardTotalScore;
    /**
     * 负面扣减总分
     */
    private Integer deductionTotalScore;

    public GeneralAssessDTO() {
        this.missionAvgFinishRate = "";
        this.contributeAwardTotalScore = 0;
        this.deductionTotalScore = 0;
    }
}