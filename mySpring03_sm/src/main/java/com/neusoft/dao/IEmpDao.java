package com.neusoft.dao;

import com.neusoft.po.Emp;

import java.util.List;

public interface IEmpDao {
    public int addEmp(Emp emp);
    public int modEmp(Emp emp);
    public int delEmp(int empid);
    public List<Emp> allEmp(Emp emp);
    public Emp getEmp(int empid);
}
