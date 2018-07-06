package com.imooc.sell.dataobject.mapper;

import com.imooc.sell.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/*
@Author: llb
@Date : 2018/7/4 17:56
*/
public interface ProductCategoryMapper {
    @Insert("insert into product_category(category_name,category_type) values " +
            "(#{category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER})")
    int insertByMap(Map<String,Object> map);

    @Insert("insert into product_category(category_name,category_type) values " +
            "(#{categoryName,jdbcType=VARCHAR},#{categoryType,jdbcType=INTEGER})")
    int insertByObject(ProductCategory productCategory);

    @Select("select * from product_category where category_type = #{categoryType,jdbcType=INTEGER}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType")
    })
    ProductCategory findByCategoryType(Integer categoryType);

    @Select("select * from product_category where category_name = #{categoryName,jdbcType=VARCHAR}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType")
    })
    List<ProductCategory> findByCategoryName(String categoryName);

    @Update("update product_category set category_name = #{categoryName,jdbcType=VARCHAR} " +
            "where category_type =  #{categoryType,jdbcType=INTEGER}")
    int updateByCategoryType(@Param("categoryName") String categoryName,@Param("categoryType") Integer categoryType);

    @Update("update product_category set category_name = #{categoryName,jdbcType=VARCHAR} " +
            "where category_type =  #{categoryType,jdbcType=INTEGER}")
    int updateByObject(ProductCategory productCategory);

    @Delete("delete from product_category where category_type =  #{categoryType,jdbcType=INTEGER}")
    int deleteByCategoryType(Integer categoryType);

    //使用xml配置的方式,在reaources下建mapper文件夹，创建ProductCategoryMapper.xml
    ProductCategory selectByCategoryType(Integer CategoryType);
}
