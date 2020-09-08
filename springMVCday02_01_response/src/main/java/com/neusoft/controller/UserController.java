package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shihaobo
 * @date 2020/9/8 10:11
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){


        return "";
    }
}
