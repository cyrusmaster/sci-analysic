package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: GeneralCoreIndexDTO
 * @Description: 核心指标总体概况DTO
 * @Date: 2020-08-18 11:18
 */
@Data
public class GeneralCoreIndexDTO {
    /**
     * 科研项目数量
     */
    private Integer itemNum;
    /**
     * 论文数量
     */
    private Integer paperNum;
    /**
     * 科研经费
     */
    private Double totalSciFee;
    /**
     * 获奖数量
     */
    private Integer awardNum;
    /**
     * 专著数量
     */
    private Integer workNum;
    /**
     * 教职工数
     */
    private Integer staffNum;
    /**
     * 本科生数
     */
    private Double ugrdNum;
    /**
     * 研究生数
     */
    private Integer pgrdNum;

    public GeneralCoreIndexDTO() {
        this.itemNum = 0;
        this.paperNum = 0;
        this.totalSciFee = 0.0;
        this.awardNum = 0;
        this.workNum = 0;
        this.staffNum = 0;
        this.ugrdNum = 0.0;
        this.pgrdNum = 0;
    }

}