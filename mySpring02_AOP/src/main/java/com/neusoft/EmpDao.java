package com.neusoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shihaobo
 * @date 2020/9/15 16:41
 */
public class EmpDao implements IEmpDao {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        IEmpDao empDao =(IEmpDao) context.getBean("empDao");
//        empDao.modEmp();
        empDao.addEmp();
    }

    @Override
    public void addEmp() {
        int i = 0;
        int j = 0;
//        j = 1/i;
        System.out.println("-------public void addEmp()----------");
    }

    @Override
    public int modEmp() {
        System.out.println("-------public void modEmp()----------");
        return 123456;
    }

    @Override
    public void delEmp() {
        System.out.println("-------public void delEmp()----------");
    }

    @Override
    public void findAllEmp() {
        System.out.println("---------- public void findAllEmp()-------");
    }
}
