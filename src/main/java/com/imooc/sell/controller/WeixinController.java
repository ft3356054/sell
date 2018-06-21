package com.imooc.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*
@Author: llb
@Date : 2018/6/21 10:40
*/
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {
    @GetMapping("/auth")
    public  void  auth(@RequestParam("code") String code){
        log.info("进入auth方法……");
        log.info("code={}",code);

        String url = "https://api.weixin.qq.com/sns"+code +"123";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        log.info("response={}",response);
        //然后拿到openid
    }
}
