package com.imooc.sell;

/*
@Author: llb
@Date : 2018/6/8 16:35
*/

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {
    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() {
        String name = "logback test";
        log.trace("log trace");
        log.debug("log debug");
        log.info("log info");
        log.warn("log warn");
        log.error("log error");

        log.info("name: "+name);
        log.info("name {}",name);
    }

}