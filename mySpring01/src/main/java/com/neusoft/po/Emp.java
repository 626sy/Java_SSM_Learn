package com.neusoft.po;

import com.neusoft.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shihaobo
 * @date 2020/9/14 9:55
 */
public class Emp {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );
        factory.getBean("emp");

    }
}
