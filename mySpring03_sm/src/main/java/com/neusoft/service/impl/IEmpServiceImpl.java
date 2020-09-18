package com.neusoft.service.impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.dao.ILog;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.mapper.EmpMapper;
import com.neusoft.mapper.ProbationMapper;
import com.neusoft.mapper.WorkLogMapper;
import com.neusoft.po.Dept;
import com.neusoft.po.Emp;
import com.neusoft.po.Probation;
import com.neusoft.po.WorkLog;
import com.neusoft.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service

public class IEmpServiceImpl implements IEmpService {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application-tx.xml");
        IEmpService empService = (IEmpService) context.getBean("IEmpServiceImpl");
        Emp e = new Emp();
        e.setEmpid(14);
        e.setStt("正式员工");
        empService.modProbation(e);     // 在Spring MVC中的Controller里面调用的

    }



    @Autowired
    ProbationMapper probationMapper;
    @Autowired
    WorkLogMapper workLogMapper;

    public void setProbationMapper(ProbationMapper probationMapper) {
        this.probationMapper = probationMapper;
    }

    public void setWorkLogMapper(WorkLogMapper workLogMapper) {
        this.workLogMapper = workLogMapper;
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
    public int modProbation(Emp emp) {
        empMapper.modEmpProbation(emp);
        Probation probation = new Probation();
        probation.setEmpid(emp.getEmpid());
        if ("正式员工" == emp.getStt()){
            probation.setRslt("通过");
        }else if ("延期转正" == emp.getStt()){
            probation.setRslt("未通过，延期执行");
        }else {
            probation.setRslt("未通过，开除");
        }
        probation.setEndtime(new Date());
        probationMapper.modEndProbation(probation);

        WorkLog workLog = new WorkLog();
        workLog.setEmpid(emp.getEmpid());
        workLog.setClss(1);
        workLog.setLoginfo("转正了，万事大吉");
        workLog.setOptime(new Date());
        workLogMapper.addLog(workLog);

        return 0;
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
