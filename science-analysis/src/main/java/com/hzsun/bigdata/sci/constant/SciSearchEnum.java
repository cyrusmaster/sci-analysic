package com.hzsun.bigdata.sci.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: SciSearchEnum
 * @Description: 科研查询 字段枚举
 * @Date: 2020/8/26 10:26
 */
public enum SciSearchEnum {
    /**
     *
     */
    PAPER_LIST(1, Constants.paperTopList, Constants.paperEndList),
    ITEM_LIST(2, Constants.itemTopList, Constants.itemEndList),
    AWARD_LIST(3, Constants.awardTopList, Constants.awardEndList),
    ORGAN_LIST(4, Constants.organTopList, Constants.organEndList),
    PATENT_LIST(5, Constants.patentTopList, Constants.patentEndList),
    REPORT_LIST(6, Constants.reportTopList, Constants.reportEndList),
    TECH_WORK_LIST(7, Constants.techWorkTopList, Constants.techWorkEndList);

    private Integer val;
    private List<Constants.ColumnEntity> topList;
    private List<Constants.ColumnEntity> endList;

    SciSearchEnum(Integer val, List<Constants.ColumnEntity> topList, List<Constants.ColumnEntity> endList) {
        this.val = val;
        this.topList = topList;
        this.endList = endList;
    }

    /**
     * Description: 获取顶部list
     *
     * @param key
     * @return: java.util.List<com.hzsun.bigdata.sci.constant.Constants.ColumnEntity>
     * @author: luomeng
     * @date: 2020/8/26 10:34
     */
    public static List<Constants.ColumnEntity> getTopList(Integer key) {
        SciSearchEnum[] enums = values();
        for (SciSearchEnum sciSearchEnum : enums) {
            if (sciSearchEnum.val.equals(key)) {
                return sciSearchEnum.topList;
            }
        }
        return new ArrayList<>();
    }

    /**
     * Description: 获取底部list
     *
     * @param key
     * @return: java.util.List<com.hzsun.bigdata.sci.constant.Constants.ColumnEntity>
     * @author: luomeng
     * @date: 2020/8/26 10:34
     */
    public static List<Constants.ColumnEntity> getEndList(Integer key) {
        SciSearchEnum[] enums = values();
        for (SciSearchEnum sciSearchEnum : enums) {
            if (sciSearchEnum.val.equals(key)) {
                return sciSearchEnum.endList;
            }
        }
        return new ArrayList<>();
    }
}
