package com.neusoft.dao;

import com.neusoft.po.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IEmpDao {
    @Insert("insert into emp(empid,ename) values(#{empid},#{ename})")
    public int addEmp(Emp emp);
    public int modEmp(Emp emp);
    public int delEmp(int empid);

    @Select("select * from emp ")
    public List<Emp> allEmp(Emp emp);
    @Select("select * from emp where empid = #{empid}")
    public Emp getEmp(int empid);
}
