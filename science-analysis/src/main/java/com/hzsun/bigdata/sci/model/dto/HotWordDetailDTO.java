package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: HotWordDetailDTO
 * @Description: 热词概况DTO
 * @Date: 2020-08-31 17:25
 */
@Data
public class HotWordDetailDTO {
    /**
     * 热词名称
     */
    private String hotWord;
    /**
     * 出现次数
     */
    private Integer appearCnt;
    /**
     * 热度值
     */
    private Double hotValue;
}