package com.imooc.sell.dao;

import com.imooc.sell.dataobject.ProductCategory;
import org.hibernate.annotations.DynamicUpdate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Transient;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
@Author: llb
@Date : 2018/6/11 13:53
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory;
        productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }
    @Test
    public  void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
    @Test
    public  void updateTest1(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
    @Test
    public  void updateTest2(){
        Optional<ProductCategory> productCategory;
        productCategory = repository.findById(1);
        ProductCategory productCategory1 = productCategory.get();
        System.out.println(productCategory1);
        productCategory1.setCategoryType(10);
        repository.save(productCategory1);
    }
    @Test
    @Transactional
    public void saveTest1(){
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        //List<Integer> list1 = new ArrayList<Integer>();list1.add(2);list1.add(3);list1.add(4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}