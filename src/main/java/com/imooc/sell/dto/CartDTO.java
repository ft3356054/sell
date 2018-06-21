package com.imooc.sell.dto;

import lombok.Data;

/*
@Author: llb
@Date : 2018/6/19 13:40
*/
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
