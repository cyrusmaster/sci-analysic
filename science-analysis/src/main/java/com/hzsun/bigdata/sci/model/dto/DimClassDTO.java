package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: DimClassDTO
 * @Description:
 * @Date: 2020-08-18 09:16
 */
@Data
public class DimClassDTO {
    /**
     * 维表类
     */
    private String dimClass;
    /**
     * 维度名
     */
    private String dimName;
    /**
     * 总层级
     */
    private String sumLayer;
    /**
     * 维度值
     */
    private String dimValue;
    /**
     * 维度所属层级
     */
    private String dimLayer;
    /**
     * 前置维度值
     */
    private String prevDimValue;

    public DimClassDTO(){

    }

    public DimClassDTO(String dimClass,String dimName,String dimValue){
        this.dimClass = dimClass;
        this.dimName = dimName;
        this.dimValue = dimValue;
    }
}