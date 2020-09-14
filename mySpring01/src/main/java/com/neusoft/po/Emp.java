package com.neusoft.po;

import com.neusoft.service.EmpService;

/**
 * @author shihaobo
 * @date 2020/9/14 9:55
 */
public class Emp {
    public static void main(String[] args) {
        Emp emp = new Emp();    // 构建
        String s = emp.toString();  // 使用
        EmpService empService = new EmpService();

        empService.addEmp();
    }
}
