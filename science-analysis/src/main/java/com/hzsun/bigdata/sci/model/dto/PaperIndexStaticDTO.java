package com.hzsun.bigdata.sci.model.dto;

import lombok.Data;

/**
 * @author luomeng
 * @Classname: PaperIndexStaticDTO
 * @Description: 论文指标统计
 * @Date: 2020-08-25 15:21
 */
@Data
public class PaperIndexStaticDTO {
    /**
     * 论文编号
     */
    private String paperNo;
    /**
     * 论文中文名称
     */
    private String chnName;
    /**
     * 论文英文名称
     */
    private String engName;
    /**
     * 单位名称
     */
    private String unitName;
    /**
     * 论文类型名称
     */
    private String paperTypeName;
    /**
     * 论著收录情况名称
     */
    private String recStatName;
    /**
     * 其他收录情况
     */
    private String otherRecStatus;
    /**
     * 第一作者
     */
    private String firstAuthor;
    /**
     * 通讯作者
     */
    private String telAuthor;
    /**
     * 刊物名称
     */
    private String prdcName;
    /**
     * 发表日期
     */
    private String publDay;

}