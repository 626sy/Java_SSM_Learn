package com.neusoft.mapper;

import com.neusoft.po.Dept;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptMapper {
    @Insert("insert into dept1(dname) values(#{dname})")
    int addDept(Dept dept);
}
