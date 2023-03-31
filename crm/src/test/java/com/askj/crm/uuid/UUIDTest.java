package com.askj.crm.uuid;

import java.util.UUID;

/**
 * @author shkstart
 * @date 2023/3/22-20:42
 */
public class UUIDTest {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(uuid);

    }
}
