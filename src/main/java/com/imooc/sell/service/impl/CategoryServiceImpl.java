package com.imooc.sell.service.impl;

import com.imooc.sell.dao.ProductCategoryRepository;
import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
@Author: llb
@Date : 2018/6/11 16:33
*/
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        Optional<ProductCategory> productCategory = repository.findById(categoryId);
        return productCategory.get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryId) {
        return repository.findByCategoryTypeIn(categoryId);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
