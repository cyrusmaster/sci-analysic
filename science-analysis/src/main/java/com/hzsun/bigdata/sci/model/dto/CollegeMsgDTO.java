package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: CollegeMsgDTO
 * @Description: 学院信息DTO
 * @Date: 2020-08-20 16:01
 */
@Data
public class CollegeMsgDTO {
    /**
     * 单位号
     */
    private String unitNo;
    /**
     * 单位名称
     */
    private String unitName;
}