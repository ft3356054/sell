package com.imooc.sell.enums;

import lombok.Getter;

/*
@Author: llb
@Date : 2018/6/15 16:45
*/
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
