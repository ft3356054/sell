package com.imooc.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.sell.enums.CodeEnum;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/*
@Author: llb
@Date : 2018/6/11 17:00
*/
@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;
    private  String productName;
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    private String productDescription;
    private  String productIcon;
    //0正常 1下架
    private Integer productStatus;
    private Integer categoryType;

    private Date createTime;
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }
}
