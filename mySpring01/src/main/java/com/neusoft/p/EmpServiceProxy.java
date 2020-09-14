package com.neusoft.p;

import com.neusoft.po.Emp;

/**
 * @author shihaobo
 * @date 2020/9/14 14:29
 */
public class EmpServiceProxy implements IEmpService {
    public IEmpService empService;

    public EmpServiceProxy(IEmpService empService) {
        this.empService = empService;
    }

    @Override
    public void addEmp(Emp emp) {
        check();
        empService.addEmp(emp);
    }

    @Override
    public void modEmp(Emp emp) {

    }

    @Override
    public void delEmp(Emp emp) {

    }

    public void check(){
        System.out.println("-----数据检查-------");
    }
}
