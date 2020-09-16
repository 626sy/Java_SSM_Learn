package com.neusoft.mapper;

import com.neusoft.po.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    @Insert( " insert into emp ( empid, ename ) values(  #{empid} , #{ename}  )  ")
    public  int addEmp(Emp emp);
    public  int modEmp(Emp emp);
    public  int delEmp(int empid);
    @Select(" select * from emp   ")
    public List<Emp> allEmp( );
    @Select(" select  * from emp where empid = #{empid} ")
    public Emp getEmp(int empid);
}
