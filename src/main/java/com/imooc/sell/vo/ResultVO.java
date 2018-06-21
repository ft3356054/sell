package com.imooc.sell.vo;

import lombok.Data;

/*
http 请求返回的最外层对象
@Author: llb
@Date : 2018/6/12 17:32
*/
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    private String msg;
    //返回的具体内容
    private T data;
}
