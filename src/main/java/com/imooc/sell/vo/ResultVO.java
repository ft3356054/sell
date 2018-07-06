package com.imooc.sell.vo;

import lombok.Data;

import java.io.Serializable;

/*
http 请求返回的最外层对象
@Author: llb
@Date : 2018/6/12 17:32
*/
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -2549931690998804019L;
    //错误码
    private Integer code;
    private String msg;
    //返回的具体内容
    private T data;
}
