package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: DrawDTO
 * @Description: 画图DTO
 * @Date: 2020-08-18 09:48
 */
@Data
public class DrawDTO {
    /**
     * X轴名称
     */
    private String xAxisName;
    /**
     * y轴名称
     */
    private String yAxisItem;
    /**
     * y轴值
     */
    private String yAxisValue;
}