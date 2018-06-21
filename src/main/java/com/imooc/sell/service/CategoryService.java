package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/*
@Author: llb
@Date : 2018/6/11 15:41
*/
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryId);
    ProductCategory save (ProductCategory productCategory);
}
