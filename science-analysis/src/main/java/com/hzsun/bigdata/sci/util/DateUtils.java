package com.hzsun.bigdata.sci.util;

import com.hzsun.bigdata.sci.constant.Constants;
import com.hzsun.zbp.basic.model.DateArea;
import com.hzsun.zbp.basic.util.BaseDateUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * @author luomeng
 * @Classname: DateUtils
 * @Description:
 * @Date: 2020-08-24 10:58
 */
public class DateUtils extends BaseDateUtils {




    /**
     * REMARK  是否当前年
     * @methodName   isCurrentYear
     * @return boolean
     * @date 2023/2/6 17:22
     * @author cyf
     */
    public static boolean isCurrentYear(String year){

        Calendar instance = Calendar.getInstance();
        String currentYear = String.valueOf(instance.get(Calendar.YEAR));
        return currentYear.equals(year);
    }






    //
    //public static void main(String[] args) {
    //    System.out.println(isCurrentYear("2022"));
    //}




    /**
     * Description: 获取时间范围
     *
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param year
     * @return: com.hzsun.zbp.basic.model.DateArea
     * @author: luomeng
     * @date: 2020/8/24 10:59
     */
    public static DateArea getDateArea(Integer timeType, String year) {
        Calendar calendar = Calendar.getInstance();
        DateArea dateArea = new DateArea();
        SimpleDateFormat sf = new SimpleDateFormat(FORMAT_PATTERN_YYYY_MM_DD);
        //月份
        if (timeType > Constants.TYPE_FLAG) {
            //获取第一天
            calendar.set(Integer.valueOf(year), timeType - 4, 1);
            dateArea.setStartDate(sf.format(calendar.getTime()));
            calendar.add(Calendar.MONTH, 1);
        } else {
            //季度
            calendar.set(Integer.valueOf(year), timeType * 3, 1);
            dateArea.setStartDate(sf.format(calendar.getTime()));
            calendar.add(Calendar.MONTH, 3);
        }
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        dateArea.setEndDate(sf.format(calendar.getTime()));
        return dateArea;
    }

    /**
     * Description: 获取月份列表
     *
     * @param year
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @return: java.util.List<java.lang.String>
     * @author: luomeng
     * @date: 2020/8/24 17:54
     */
    public static List<String> getMonthList(String year, Integer timeType) {
        List<String> monthList = new ArrayList<>();
        if (timeType > Constants.TYPE_FLAG) {
            monthList.add(year + (timeType - Constants.TYPE_FLAG > 12 ? timeType - Constants.TYPE_FLAG : "0" + (timeType - Constants.TYPE_FLAG)));
        } else {
            for (int i = timeType * Constants.TYPE_FLAG + 1; i - timeType * Constants.TYPE_FLAG <= Constants.TYPE_FLAG; i++) {
                monthList.add(year + (i > 12 ? i : "0" + i));
            }
        }
        return monthList;
    }


}