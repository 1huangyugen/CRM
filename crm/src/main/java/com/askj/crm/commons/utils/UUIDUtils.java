package com.askj.crm.commons.utils;

import java.util.UUID;

/**
 * @author shkstart
 * @date 2023/3/22-20:54
 *
 * UUID的封装类
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
