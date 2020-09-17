package com.neusoft.service.impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.dao.ILog;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.mapper.EmpMapper;
import com.neusoft.po.Dept;
import com.neusoft.po.Emp;
import com.neusoft.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
/**
 * @author shihaobo
 * @date 2020/9/16 10:16
 */
public class IEmpServiceImpl implements IEmpService {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application-tx.xml");
        IEmpService empService = (IEmpService) context.getBean("empService");
        Emp e = new Emp();
        e.setEname("扎西德勒");
        empService.addEmp(e);
    }


    @Autowired
    EmpMapper empMapper;
    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }
    @Autowired
    DeptMapper deptMapper;

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public int addEmp(Emp emp) {
        //开启事务
        int i =  empMapper.addEmp(emp);
        Dept dept = new Dept();
        dept.setDname("test1");
        //传播事务
        deptMapper.addDept(dept);
        //提交事务
        return i;
    }

    @Override
    public int modEmp(Emp emp) {
        return 0;
    }

    @Override
    public int delEmp(int empid) {
        return 0;
    }

    @Override
    public List<Emp> allEmp( ) {

        List<Emp> les = empMapper.allEmp();
        return  les;
    }

    @Override
    public Emp getEmp(int empid) {
        return null;
    }
}
