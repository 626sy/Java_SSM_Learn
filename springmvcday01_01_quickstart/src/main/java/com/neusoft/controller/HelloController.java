package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shihaobo
 * @date 2020/9/7 14:55
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello Controller");
        return "success";
    }

    @RequestMapping(path = "/hello1")
    public String sayHello1(){
        System.out.println("sayHello1");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping",params = "username", headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("testRequestMapping.....");
        return "success";
    }

}
