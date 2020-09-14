package com.neusoft.spaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shihaobo
 * @date 2020/9/14 15:56
 */
public class EmpDaoImpl implements IEmpDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//        IEmpDao empDao =(IEmpDao) context.getBean("empDao");
////        empDao.addEmp();
////        empDao.delEmp();
//        empDao.findAllEmp();
        IDeptDao deptDao =(IDeptDao) context.getBean("deptDao");
        deptDao.addDept();
    }
    @Override
    public void addEmp() {
        System.out.println("-----public void addEmp()---------");
    }

    @Override
    public void modEmp() {
        System.out.println("-----public void modEmp()---------");
    }

    @Override
    public void delEmp() {
        System.out.println("-----public void delEmp()---------");
    }

    @Override
    public void findAllEmp() {
        System.out.println("-----public void findAllEmp()---------");
    }
}
