package com.neusoft.test;

import com.neusoft.domain.Emp;
import com.neusoft.service.IEmpService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.EnumMap;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/5 16:20
 */
public class TestEmpService {
    private ClassPathXmlApplicationContext ac1 = new ClassPathXmlApplicationContext("bean.xml");
    private IEmpService es = ac1.getBean("empService", IEmpService.class);

    @Test
    public void testFindAll(){
        List<Emp> all = es.findAll();
        for (Emp emp:all){
            System.out.println(emp);
        }
    }

    @Test
    public void testFindById(){
        Emp emp = es.findById(8888);
        System.out.println(emp);
    }

    @Test
    public void testSaveEmp(){
        Emp emp = new Emp();
        emp.setEname("AAAA");
        emp.setJob("BBBB");
        emp.setMgr(8888);
        emp.setSal(9000);
        emp.setComm(500);
        emp.setHiredate(new Date());
        emp.setDeptno(50);
        es.saveEmp(emp);
    }

    @Test
    public void testUpdateEmp(){
        Emp emp = new Emp();
        emp.setEmpno(10003);
        emp.setEname("AAAA");
        emp.setJob("BBBB");
        emp.setMgr(10000);
        emp.setSal(9000);
        emp.setComm(500);
        emp.setHiredate(new Date());
        emp.setDeptno(40);
        es.updateEmp(emp);
    }

    @Test
    public void testDeleteEmp(){
        Emp emp = new Emp();
        es.deleteEmp(10003);
    }

}
