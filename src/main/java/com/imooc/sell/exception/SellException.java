package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;
import lombok.Getter;

/*
@Author: llb
@Date : 2018/6/19 11:04
*/
@Getter
public class SellException extends RuntimeException{
    private  Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super();
        this.code = code;
    }
}
