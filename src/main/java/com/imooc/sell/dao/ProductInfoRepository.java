package com.imooc.sell.dao;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.chrono.JapaneseChronology;
import java.util.List;

/*
@Author: llb
@Date : 2018/6/11 17:04
*/
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
