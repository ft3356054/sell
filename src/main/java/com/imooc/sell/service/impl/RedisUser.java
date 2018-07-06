package com.imooc.sell.service.impl;

import com.imooc.sell.exception.SellException;
import com.imooc.sell.service.RedisLock;
import org.springframework.beans.factory.annotation.Autowired;

/*
@Author: llb
@Date : 2018/7/6 16:37
*/
public class RedisUser {
    private static  final  int TIMEOUT = 10*1000;//超时时间10s
    @Autowired
    private RedisLock redisLock;

    private String productId = "";

    public  void  demoRedis(){
        //加锁
        long time = System.currentTimeMillis() + TIMEOUT;
        if(!redisLock.lock(productId , String.valueOf(time))){
            throw new SellException(101,"请求人数太多了，换个姿势再试试~");
        }

        /*
        方法
        * */

        //解锁
        redisLock.unlock(productId,String.valueOf(time));
    }
}
