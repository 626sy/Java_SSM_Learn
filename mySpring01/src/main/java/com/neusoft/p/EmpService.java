package com.neusoft.p;

import com.neusoft.po.Emp;

/**
 * @author shihaobo
 * @date 2020/9/14 14:06
 */
public class EmpService implements IEmpService {
    /**
     * 我们在数据库中限定ename maxlength=5
//     * @param emp
     */

    public void addEmp(Emp emp){
        System.out.println("----------public void addEmp()------------");
    }
    public void modEmp(Emp emp){
        System.out.println("----------public void modEmp()------------");
    }
    public void delEmp(Emp emp){
        System.out.println("----------public void delEmp()------------");
    }

    public static void main(String[] args) {
        IEmpService empService = new EmpServiceProxy(new EmpService());
        empService.addEmp(new Emp());
    }
}
