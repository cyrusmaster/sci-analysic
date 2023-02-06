package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: HonorStaticDTO
 * @Description:
 * @Date: 2020-08-19 09:12
 */
@Data
public class HonorStaticDTO {
    /**
     * 所在学科
     */
    private String scienceName;
    /**
     * 所在单位
     */
    private String unitName;
    /**
     * 奖项名称
     */
    private String awardName;
    /**
     * 获奖类别
     */
    private String winClass;
    /**
     * 获奖等级
     */
    private String awardLevel;
    /**
     * 完成人
     */
    private String authorName;
    /**
     * 完成人排名
     */
    private String authorRank;
    /**
     * 完成单位排名
     */
    private String unitRank;
    /**
     * 获奖年度
     */
    private String winYear;
}