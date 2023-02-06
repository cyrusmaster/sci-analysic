package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SchoolDetailDTO
 * @Description: 科研横向对比-学校科研信息明细
 * @Date: 2020-08-31 15:55
 */
@Data
public class SciSchDetailDTO {
    /**
     * 学校编号
     */
    private String schNo;
    /**
     * 学校名称
     */
    private String schName;
    /**
     * 一级学科名称
     */
    private String subjClassName;
//    /**
//     * 科研经费投入金额
//     */
//    private Double sciInputFee;
//
//    /**
//     * 国家自然科学奖次数
//     */
//    private Integer sciAwdcnt;
//
//    /**
//     * 国家科技进步奖次数
//     */
//    private Integer tchAwdcnt;

    /**
     * 国家自然科学基金奖次数
     */
    private Integer sciFundCnt;

    /**
     * sci收录论文篇数
     */
    private Integer sciPaperNum;

    /**
     * ei收录论文篇数
     */
    private Integer eiPaperNum;


}