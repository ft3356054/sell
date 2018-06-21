package com.imooc.sell.dao;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/*
@Author: llb
@Date : 2018/6/15 17:02
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private  OrderMasterRepository repository;

    private final  String OPENID = "110110";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId( "1234567");
        orderMaster.setBuyerName("尸兄");
        orderMaster.setBuyerPhone("18812345678");
        orderMaster.setBuyerAddress("地址");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByBuyerOpenid() throws Exception{
        PageRequest request =  PageRequest.of(0,1   );
        Page<OrderMaster> result =  repository.findByBuyerOpenid(OPENID,request);
        Assert.assertNotEquals(0,result);
        System.out.println(result.getTotalElements());
    }
}