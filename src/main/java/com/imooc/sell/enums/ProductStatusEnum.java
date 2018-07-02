package com.imooc.sell.enums;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;

/*
商品状态
@Author: llb
@Date : 2018/6/12 16:19
*/
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架") ;

    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message = message;
    }
}
