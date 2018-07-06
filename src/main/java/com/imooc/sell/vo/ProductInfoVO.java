package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/*
商品详情
@Author: llb
@Date : 2018/6/13 16:45
*/
@Data
public class ProductInfoVO implements Serializable {

    //前端展示添加序列化
    private static final long serialVersionUID = -3287905598900587294L;

    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private String productDescription;
    @JsonProperty("icon")
    private  String productIcon;
}
