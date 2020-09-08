package com.neusoft.controller;

import com.neusoft.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shihaobo
 * @date 2020/9/8 10:11
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){
        User user = new User();
        // 假装么 这只调用service查出的结果
        user.setUsername("龙岩");
        user.setPassword("123");
        user.setAge(16);
        // model 对象会存储在request中
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid.......");

        // 请求转发去响应
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        response.sendRedirect(request.getContextPath()+"/index.jsp");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().write("你好啊");
        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView........");
        ModelAndView mv = new ModelAndView();
        User user = new User();
        // 假装么 这只调用service查出的结果
        user.setUsername("张无忌");
        user.setPassword("456");
        user.setAge(16);

        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;

    }

    @RequestMapping("/test")
    public String testFOR(){
        System.out.println("testFOR...");
        return "redirect:/index.jsp";
    }
}
