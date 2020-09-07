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
        // 调用service
        // req.setattribute
        return "success";
    }

    @RequestMapping(path = "/hello1")
    public String sayHello1(){
        System.out.println("sayHello1");
        return "success";
    }

    @RequestMapping(path = "/hehe")
    public String sayHello2(){
        System.out.println("Hello controller");
        System.out.println("hehe");
        return "success";
    }


    @RequestMapping(value = "/testRequestMapping",params = {"username=hehe"}, headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("testRequestMapping.....");
        return "success";
    }

}
