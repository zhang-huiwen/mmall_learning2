package com.mmall2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhw on 2020/3/2.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    //测试接口，测试natnpp
    @RequestMapping("test.do")
    @ResponseBody
    public String test(String str){
        logger.info("testinfo");
        logger.warn("testwarn");
        logger.error("testerror");
        return "testValue:"+str;
    }
}
