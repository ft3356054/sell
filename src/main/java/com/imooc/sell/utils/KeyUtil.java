package com.imooc.sell.utils;

/*
@Author: llb
@Date : 2018/6/19 13:29
*/

import java.util.Random;

public class KeyUtil {
    //生成主键  时间+随机数
    public static  synchronized  String genUnqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
