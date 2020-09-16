package com.neusoft.service;

import com.neusoft.po.Emp;

import java.util.List;

public interface IEmpService {
    public int addEmp(Emp emp);
    public int modEmp(Emp emp);
    public int delEmp(int empid);
    public List<Emp> allEmp();
    public Emp getEmp(int empid);
}
