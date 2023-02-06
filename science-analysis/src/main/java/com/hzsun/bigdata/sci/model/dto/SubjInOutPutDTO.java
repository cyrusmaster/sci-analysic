package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SubjInOutPutDTO
 * @Description: 学科投入产出统计表
 * @Date: 2020-08-24 17:40
 */
@Data
public class SubjInOutPutDTO {
    /**
     * 所属学科
     */
    private String subjClassName;
    /**
     * 时间
     */
    private String monthStr;
    /**
     * 科研人数
     */
    private Integer sciNum;
    /**
     * 政府经费
     */
    private Integer govFund;
    /**
     * 其他经费
     */
    private Integer otherFund;
    /**
     * 出版专著数
     */
    private Integer techWorkNum;
    /**
     * 国外论文数
     */
    private Integer fgnPaperNum;
    /**
     * 国内论文数
     */
    private Integer domesticPaperNum;
    /**
     * 获奖数
     */
    private Integer winAchvNum;
    /**
     * 专利成果数
     */
    private Integer patentAchvNum;

}