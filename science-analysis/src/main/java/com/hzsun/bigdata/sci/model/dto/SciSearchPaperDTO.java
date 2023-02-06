package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: SciSearchPaper
 * @Description: 论文
 * @Date: 2020-08-26 10:57
 */
@Data
public class SciSearchPaperDTO {
    /**
     * 总数
     */
    private Integer totalPaperNum;
    /**
     * SCI-E论文总数
     */
    private Integer sciePaperNum;
    /**
     * SSCI论文总数
     */
    private Integer ssciPaperNum;
    /**
     * CSCD论文总数
     */
    private Integer cscdPaperNum;
    /**
     * 论文中文名
     */
    private String paperChnName;
    /**
     * 论文英文名
     */
    private String paperEngName;
    /**
     * 第一作者
     */
    private String firstAuthor;
    /**
     * 通讯作者
     */
    private String telAuthor;
    /**
     * 发表刊物
     */
    private String prdcName;
    /**
     * 人员属性
     */
    private String staffTitle;

    public SciSearchPaperDTO() {
        this.totalPaperNum = 0;
        this.sciePaperNum = 0;
        this.ssciPaperNum = 0;
        this.cscdPaperNum = 0;
    }
}