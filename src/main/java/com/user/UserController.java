package com.user;

import com.vo.TestProperties;
import org.apache.catalina.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("user")
public class UserController {
    public static final Logger LOGGER= (Logger) LoggerFactory.getLogger(UserController.class);
    @Autowired
    TestProperties testProperties;
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("testProperties")
    public String testProperties(){
        return "Name"+testProperties.getName();
    }
    @RequestMapping("Logger")
    public String logger(){
        LOGGER.trace("This is trace log");
        LOGGER.debug("This is debug log");
        LOGGER.info("This is info log");
        LOGGER.warn("This is warn log");
        LOGGER.error("This is error log");
        return "";
    }
}
