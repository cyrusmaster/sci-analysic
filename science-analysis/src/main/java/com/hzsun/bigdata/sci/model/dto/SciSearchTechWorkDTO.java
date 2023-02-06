package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchTechWorkDTO
 * @Description: 著作
 * @Date: 2020-08-26 11:00
 */
@Data
public class SciSearchTechWorkDTO {

    /**
     * 著作总数
     */
    private Integer totalTechWorkNum;
    /**
     * 国际出版著作总数
     */
    private Integer intlTechWorkNum;
    /**
     * 国家出版著作总数
     */
    private Integer ctryTechWorkNum;
    /**
     * 其他出版著作总数
     */
    private Integer otherTechWorkNum;

    /**
     * 著作中文名称
     */
    private String techWorkChinName;
    /**
     * 著作英文名称
     */
    private String techWorkEngName;
    /**
     * 单位名称
     */
    private String unitName;
    /**
     * 出版社
     */
    private String publName;
    /**
     * 出版日期
     */
    private String publDay;
    /**
     * 出版号
     */
    private String publNo;
    /**
     * 著作字数
     */
    private String techWorkWordsNum;
    /**
     * 成果等级号
     */
    private String techAchvLvName;

    public SciSearchTechWorkDTO() {
        this.totalTechWorkNum = 0;
        this.intlTechWorkNum = 0;
        this.ctryTechWorkNum = 0;
        this.otherTechWorkNum = 0;
    }
}