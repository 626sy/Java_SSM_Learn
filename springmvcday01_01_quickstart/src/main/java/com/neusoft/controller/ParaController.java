package com.neusoft.controller;

import com.neusoft.domain.Account;
import com.neusoft.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shihaobo
 * @date 2020/9/7 15:31
 */
@Controller
@RequestMapping("/param")
public class ParaController {
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("testParam执行了。。。");
        System.out.println("username"+username);
        System.out.println("password"+password);
        return "success";
    }

    // JavaBean
    @RequestMapping("/saveAccount")
    public String testParam(Account account){
        System.out.println("saveAccount");
        System.out.println(account);
        return "success";
    }

//    自定义类型转换器

    @RequestMapping("/saveUser")
    public String testParam(User user){
        System.out.println("saveUser");
        System.out.println(user);
        return "success";
    }

}
