package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciPlatformDTO
 * @Description: 科研能力横向对比-公用dto
 * @Date: 2020-08-31 15:23
 */
@Data
public class SciAbleCommonDTO {
    /**
     * 类别
     */
    private String type;
    /**
     * 类别名称
     */
    private String typeName;
    /**
     * 类别数量
     */
    private Double typeNum;
    /**
     * 去年数量
     */
    private Double lastNum;
    /**
     * 较去年新增数量
     */
    private Double moreLastNum;
    /**
     * 较去年新增比例
     */
    private Double moreLastRate;
    /**
     * 同类学校平均值
     */
    private Double avgNum;
    /**
     * 较同类学校多数值
     */
    private Double moreAvgNum;
    /**
     * 较同类学校多比例
     */
    private Double moreAvgRate;
}