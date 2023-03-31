package com.askj.crm.commons.utils;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @date 2023/3/21-21:01
 * 对date类型数据进行处理的工具类
 */

//对重复的代码进行封装，需要的时候直接调用，不用在写一次
public class DateUtils {

    /**
     * 对指定的date对象进行格式化：yyyy-MM-dd HH:mm:ss
     * @param date
     */
    public static  String formateDateTime(Date date){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 对指定的date对象进行格式化：yyyy-MM-dd HH:mm:ss
     * @param date
     */
    public static  String formateDate(Data date){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 对指定的date对象进行格式化：yyyy-MM-dd HH:mm:ss
     * @param date
     */
    public static  String formateTime(Data date){
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }

}
