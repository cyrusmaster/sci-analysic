package com.hzsun.bigdata.sci.constant;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: Constant
 * @Description: 常量
 * @Date: 2020-08-26 10:07
 */
public class Constants {
    /**
     * 公用数据量标识
     */
    public static final Integer TYPE_FLAG = 3;

    /**
     * 百分号标识
     */
    public static final String PERCENT = "%";

    /**
     * 论文顶部字段
     */
    public static List<ColumnEntity> paperTopList = new LinkedList<>();
    /**
     * 论文底部字段
     */
    public static List<ColumnEntity> paperEndList = new LinkedList<>();
    /**
     * 项目顶部字段
     */
    public static List<ColumnEntity> itemTopList = new LinkedList<>();
    /**
     * 项目底部字段
     */
    public static List<ColumnEntity> itemEndList = new LinkedList<>();
    /**
     * 获奖顶部字段
     */
    public static List<ColumnEntity> awardTopList = new LinkedList<>();
    /**
     * 获奖底部字段
     */
    public static List<ColumnEntity> awardEndList = new LinkedList<>();
    /**
     * 平台基地顶部字段
     */
    public static List<ColumnEntity> organTopList = new LinkedList<>();
    /**
     * 平台基地底部字段
     */
    public static List<ColumnEntity> organEndList = new LinkedList<>();
    /**
     * 专利基地顶部字段
     */
    public static List<ColumnEntity> patentTopList = new LinkedList<>();
    /**
     * 专利基地底部字段
     */
    public static List<ColumnEntity> patentEndList = new LinkedList<>();
    /**
     * 会议报告顶部字段
     */
    public static List<ColumnEntity> reportTopList = new LinkedList<>();
    /**
     * 会议报告底部字段
     */
    public static List<ColumnEntity> reportEndList = new LinkedList<>();
    /**
     * 著作顶部字段
     */
    public static List<ColumnEntity> techWorkTopList = new LinkedList<>();
    /**
     * 著作底部字段
     */
    public static List<ColumnEntity> techWorkEndList = new LinkedList<>();
    /**
     * 四大类项目指标-目标任务字段
     */
    public static List<ColumnEntity> fourCodeTargetList = new LinkedList<>();
    /**
     * 四大类项目指标-贡献奖励得分字段
     */
    public static List<ColumnEntity> fourCodeAwardList = new LinkedList<>();
    /**
     * 四大类项目指标-负面扣减分值字段
     */
    public static List<ColumnEntity> fourCodeDeductionList = new LinkedList<>();

    static {
        //1.论文
        getPaperList();
        //2.项目
        getItemList();
        //3.获奖
        getAwardList();
        //4.平台基地
        getOrganList();
        //5.专利
        getPatentList();
        //6.会议报告
        getReportList();
        //7.著作
        getTechWorkList();
        //四大类项目指标-目标任务字段
        getFourCodeTargetList();
        //四大类项目指标-贡献奖励得分字段
        getFourCodeAwardList();
        //四大类项目指标-负面扣减分值字段
        getFourCodeDeductionList();
    }

    /**
     * 四大类项目指标-目标任务字段
     */
    private static void getFourCodeTargetList() {
        fourCodeTargetList.add(new ColumnEntity("指标名称", "indexName"));
        fourCodeTargetList.add(new ColumnEntity("所属一级指标", "firstIndexName"));
        fourCodeTargetList.add(new ColumnEntity("目标任务值", "aimMissionValue"));
        fourCodeTargetList.add(new ColumnEntity("权重", "weightValue"));
        fourCodeTargetList.add(new ColumnEntity("完成情况", "missionFinishValue"));
        fourCodeTargetList.add(new ColumnEntity("完成率", "finishRate"));
    }

    /**
     * 四大类项目指标-贡献奖励得分字段
     */
    private static void getFourCodeAwardList() {
        fourCodeAwardList.add(new ColumnEntity("指标名称", "indexName"));
        fourCodeAwardList.add(new ColumnEntity("所属一级指标", "firstIndexName"));
        fourCodeAwardList.add(new ColumnEntity("指标贡献奖励得分", "awardScore"));
    }

    /**
     * 四大类项目指标-负面扣减分值字段
     */
    private static void getFourCodeDeductionList() {
//        fourCodeDeductionList.add(new ColumnEntity("扣分指标号", "deductionIndexNo"));
        fourCodeDeductionList.add(new ColumnEntity("扣分指标名称", "deductionIndexName"));
        fourCodeDeductionList.add(new ColumnEntity("扣分次数", "deductionCnt"));
        fourCodeDeductionList.add(new ColumnEntity("扣分指标总分值", "deductionIndexTotalScore"));
        fourCodeDeductionList.add(new ColumnEntity("考核单位名称", "evalUnitName"));
    }

    /**
     * 论文
     */
    private static void getPaperList() {
        //顶部
        paperTopList.add(new ColumnEntity("总数", "totalPaperNum"));
        paperTopList.add(new ColumnEntity("SCI-E论文总数", "sciePaperNum"));
        paperTopList.add(new ColumnEntity("SSCI论文总数", "ssciPaperNum"));
        paperTopList.add(new ColumnEntity("CSCD论文总数", "cscdPaperNum"));
        //底部
        paperEndList.add(new ColumnEntity("论文中文名", "paperChnName"));
//        paperEndList.add(new ColumnEntity("论文英文名", "paperEngName"));
        paperEndList.add(new ColumnEntity("第一作者", "firstAuthor"));
        paperEndList.add(new ColumnEntity("通讯作者", "telAuthor"));
        paperEndList.add(new ColumnEntity("发表刊物", "prdcName"));
//        paperEndList.add(new ColumnEntity("人员属性", "staffTitle"));
    }

    /**
     * 项目
     */
    private static void getItemList() {
        //顶部
        itemTopList.add(new ColumnEntity("项目总数", "totalItemNum"));
        itemTopList.add(new ColumnEntity("横向项目总数", "totalHItemNum"));
        itemTopList.add(new ColumnEntity("纵向项目总数", "totalVItemNum"));
        //底部
        itemEndList.add(new ColumnEntity("项目名称", "itemName"));
        itemEndList.add(new ColumnEntity("开始时间", "startDay"));
        itemEndList.add(new ColumnEntity("截止时间", "endDay"));
        itemEndList.add(new ColumnEntity("负责人", "leaderName"));
        itemEndList.add(new ColumnEntity("项目级别", "itemRank"));
        itemEndList.add(new ColumnEntity("项目类别", "itemClassName"));
        itemEndList.add(new ColumnEntity("经费来源", "fundSrcName"));
        itemEndList.add(new ColumnEntity("计划经费总额(万)", "fundTotalFee"));
        itemEndList.add(new ColumnEntity("当前到账经费(万)", "curFundFee"));
    }

    /**
     * 获奖
     */
    private static void getAwardList() {
        //顶部
        awardTopList.add(new ColumnEntity("获奖总数", "winAchvNum"));
        awardTopList.add(new ColumnEntity("国家级获奖总数", "ctryWinAchvNum"));
        awardTopList.add(new ColumnEntity("国际级获奖总数", "intlWinAchvNum"));
        awardTopList.add(new ColumnEntity("其他获奖总数", "otherWinAchvNum"));
        //底部
        awardEndList.add(new ColumnEntity("获奖名称", "winAchvName"));
//        awardEndList.add(new ColumnEntity("项目来源名称", "itemSrcName"));
        awardEndList.add(new ColumnEntity("单位名称", "unitName"));
        awardEndList.add(new ColumnEntity("获奖日期", "winDate"));
        awardEndList.add(new ColumnEntity("获奖类别", "winAchvClsName"));
//        awardEndList.add(new ColumnEntity("科技奖类别名称", "techWinAchvClsName"));
        awardEndList.add(new ColumnEntity("奖励等级", "awrdLvName"));
        awardEndList.add(new ColumnEntity("获奖级别", "winRankName"));
        awardEndList.add(new ColumnEntity("颁奖单位", "grantAwrdUnit"));
//        awardEndList.add(new ColumnEntity("单位排名", "unitRank"));
//        awardEndList.add(new ColumnEntity("负责人排名", "chargePnslRank"));
        awardEndList.add(new ColumnEntity("作者", "autherName"));
        awardEndList.add(new ColumnEntity("成果等级", "techAchvLvName"));
    }

    /**
     * 平台基地
     */
    private static void getOrganList() {
        //顶部
        organTopList.add(new ColumnEntity("机构总数", "totalOrganNum"));
        organTopList.add(new ColumnEntity("基础研究机构总数", "baseRescOrganNum"));
        organTopList.add(new ColumnEntity("基础研究机构总数", "appRescOrganNum"));
        organTopList.add(new ColumnEntity("理论研究机构总数", "theoryRescOrganNum"));

        //底部
        organEndList.add(new ColumnEntity("负责人姓名", "chargePsnlName"));
        organEndList.add(new ColumnEntity("机构名称", "organName"));
        organEndList.add(new ColumnEntity("机构类型", "organTypeName"));
        organEndList.add(new ColumnEntity("批准年月", "apvMon"));
        organEndList.add(new ColumnEntity("评估时间", "prevEvalDay"));
        organEndList.add(new ColumnEntity("评估结果", "prevEvalResult"));
    }

    /**
     * 专利
     */
    private static void getPatentList() {
        //顶部
        patentTopList.add(new ColumnEntity("专利总数", "totalPatentAchvNum"));
        patentTopList.add(new ColumnEntity("发明专利总数", "inventPatentAchvNum"));
        patentTopList.add(new ColumnEntity("实用新型专利总数", "unilModelPatentAchvNum"));
        patentTopList.add(new ColumnEntity("PCT或国外专利总数", "pctPatentAchvNum"));
        //底部
        patentEndList.add(new ColumnEntity("专利名称", "patentAchvName"));
        patentEndList.add(new ColumnEntity("单位", "unitName"));
//        patentEndList.add(new ColumnEntity("专利类型", "patentTypeName"));
        patentEndList.add(new ColumnEntity("批准日期", "apvDay"));
        patentEndList.add(new ColumnEntity("专利证书编号", "patentCertNo"));
        patentEndList.add(new ColumnEntity("交纳专利年费日期", "payPatentFeeDay"));
        patentEndList.add(new ColumnEntity("交纳金额", "payFee"));
        patentEndList.add(new ColumnEntity("授权公告日期", "authAnncDay"));
        patentEndList.add(new ColumnEntity("申请名称", "applyName"));
        patentEndList.add(new ColumnEntity("专利代理机构", "patentAgencyOrgan"));
//        patentEndList.add(new ColumnEntity("专利代理人", "patentAgencyPsnl"));
        patentEndList.add(new ColumnEntity("专利权人", "patenteeName"));
//        patentEndList.add(new ColumnEntity("专利终止日期", "patentEndDay"));
        patentEndList.add(new ColumnEntity("成果等级", "techAchvLvName"));
    }

    /**
     * 会议报告
     */
    private static void getReportList() {
        //顶部
        reportTopList.add(new ColumnEntity("会议总数", "totalAcadConfNum"));
        reportTopList.add(new ColumnEntity("国际会议总数", "intlAcadConfNum"));
        reportTopList.add(new ColumnEntity("国家会议总数", "ctryAcadConfNum"));
        reportTopList.add(new ColumnEntity("其他会议总数", "otherAcadConfNum"));
        //底部
        reportEndList.add(new ColumnEntity("会议名称", "acadConfName"));
        reportEndList.add(new ColumnEntity("会议地点", "acadConfPlace"));
        reportEndList.add(new ColumnEntity("起始日期", "acadConfStartDate"));
        reportEndList.add(new ColumnEntity("终止日期", "acadConfEndDate"));
        reportEndList.add(new ColumnEntity("举办单位", "holdUnit"));
        reportEndList.add(new ColumnEntity("会议人数", "acadConfPsnlNum"));
        reportEndList.add(new ColumnEntity("参加单位", "attendUnit"));
        reportEndList.add(new ColumnEntity("投入经费(万)", "inputFund"));
        reportEndList.add(new ColumnEntity("论文篇数", "paperNum"));
    }

    /**
     * 著作
     */
    private static void getTechWorkList() {
        //顶部
        techWorkTopList.add(new ColumnEntity("著作总数", "totalTechWorkNum"));
        techWorkTopList.add(new ColumnEntity("国际出版著作总数", "intlTechWorkNum"));
        techWorkTopList.add(new ColumnEntity("国家出版著作总数", "ctryTechWorkNum"));
        techWorkTopList.add(new ColumnEntity("其他出版著作总数", "otherTechWorkNum"));
        //底部
        techWorkEndList.add(new ColumnEntity("著作中文名称", "techWorkChinName"));
//        techWorkEndList.add(new ColumnEntity("著作英文名称", "techWorkEngName"));
        techWorkEndList.add(new ColumnEntity("单位名称", "unitName"));
        techWorkEndList.add(new ColumnEntity("出版社", "publName"));
        techWorkEndList.add(new ColumnEntity("出版日期", "publDay"));
        techWorkEndList.add(new ColumnEntity("出版号", "publNo"));
        techWorkEndList.add(new ColumnEntity("著作字数", "techWorkWordsNum"));
        techWorkEndList.add(new ColumnEntity("成果等级", "techAchvLvName"));
    }


    @Data
    public static class ColumnEntity {

        private String columnName;

        private String columnValue;

        public ColumnEntity() {
        }

        public ColumnEntity(String columnName, String columnValue) {
            this.columnName = columnName;
            this.columnValue = columnValue;
        }
    }

    public static void main(String[] arg0) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 9, 15);
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        String time = "";
        for (int i = 0; i < 10; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            time += sf.format(calendar.getTime()) + ",";
        }
        System.out.println("day: " + time);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2020, 9, 25,0,0);
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMddHH");
        String time2 = "";
        for (int i = 0; i < 10*24; i++) {
            calendar2.add(Calendar.HOUR, 1);
            time2 += sf2.format(calendar2.getTime()) + ",";
        }
        System.out.println("hour: " + time2);
    }
}