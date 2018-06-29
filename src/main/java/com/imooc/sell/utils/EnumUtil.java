package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/*
@Author: llb
@Date : 2018/6/29 15:16
*/
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code , Class<T> enumClass){
        for (T each:enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
