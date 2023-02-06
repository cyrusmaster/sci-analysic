package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchReportDTO
 * @Description: 会议报告
 * @Date: 2020-08-26 11:00
 */
@Data
public class SciSearchReportDTO {

    /**
     * 会议总数
     */
    private Integer totalAcadConfNum;
    /**
     * 国际会议总数
     */
    private Integer intlAcadConfNum;
    /**
     * 国家会议总数
     */
    private Integer ctryAcadConfNum;
    /**
     * 其他会议总数
     */
    private Integer otherAcadConfNum;
    /**
     * 会议名称
     */
    private String acadConfName;
    /**
     * 会议地点
     */
    private String acadConfPlace;
    /**
     * 会议起始日期
     */
    private String acadConfStartDate;
    /**
     * 会议终止日期
     */
    private String acadConfEndDate;
    /**
     * 举办单位
     */
    private String holdUnit;
    /**
     * 会议人数
     */
    private Integer acadConfPsnlNum;
    /**
     * 参加单位
     */
    private String attendUnit;
    /**
     * 投入经费
     */
    private Double inputFund;
    /**
     * 论文篇数
     */
    private Integer paperNum;

    public SciSearchReportDTO() {
        this.totalAcadConfNum = 0;
        this.intlAcadConfNum = 0;
        this.ctryAcadConfNum = 0;
        this.otherAcadConfNum = 0;
    }
}