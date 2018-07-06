package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/*
商品（包含类目）
@Author: llb
@Date : 2018/6/13 10:28
*/
@Data
public class ProductVO implements Serializable {


    private static final long serialVersionUID = -6588259958095399645L;
    @JsonProperty("name")
    private String categoryName ;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
