package com.neusoft.controller;

import com.neusoft.po.Emp;
import com.neusoft.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/17 14:41
 */
@Controller
@RequestMapping("/emp")
public class EmpController {


    @RequestMapping("all")
    @ResponseBody   // 获取写在这里也可以
    public List<Emp> allEmp(){
        List<Emp> les = empService.allEmp();
        return les;
    }

    @Autowired
    IEmpService empService;

    public void setEmpService(IEmpService empService) {
        this.empService = empService;
    }
}
