package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: StaffOutPutInfoDTO
 * @Description: 教职工成果产出信息DTO
 * @Date: 2020-08-25 09:26
 */
@Data
public class StaffOutPutInfoDTO {
    /**
     * 著作数
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

    public StaffOutPutInfoDTO() {
        this.techWorkNum = 0;
        this.fgnPaperNum = 0;
        this.domesticPaperNum = 0;
        this.winAchvNum = 0;
        this.patentAchvNum = 0;
    }

}