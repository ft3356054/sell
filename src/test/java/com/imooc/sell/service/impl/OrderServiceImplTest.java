package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/*
@Author: llb
@Date : 2018/6/19 13:57
*/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYEROPENID = "110110";
    private final  String ORDER_ID = "1529389273969919009";

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("LLB");
        orderDTO.setBuyerAddress("慕课廖");
        orderDTO.setBuyerPhone("18511112222");
        orderDTO.setBuyerOpenid(BUYEROPENID);
        //购物车
        List<OrderDetail> orderDetails = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123131");
        o1.setProductQuantity(1);
        orderDetails.add(o1);
        orderDTO.setOrderDetailList(orderDetails);

        OrderDTO result = orderService.create(orderDTO);
        log.info("创建订单 result ={}",result);
    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        log.info("result={}",orderDTO);
        Assert.assertEquals(orderDTO.getOrderId(),ORDER_ID);
    }

    @Test
    public void findList() {
        PageRequest request  =  PageRequest.of(0,2);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYEROPENID,request);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());
    }

    @Test
    public void finish() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISH.getCode(),result.getOrderStatus());
    }

    @Test
    public void paid() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(),result.getPayStatus());
    }

    @Test
    public void list() {
        PageRequest request = PageRequest.of(0,2);
        Page<OrderDTO> orderDTOPage = orderService.findList(request);
// 测试方法1       Assert.assertNotEquals(0, orderDTOPage.getTotalElements());
        //测试方法2
        Assert.assertTrue("查询所有的订单列表", orderDTOPage.getTotalElements() > 0);
    }
}