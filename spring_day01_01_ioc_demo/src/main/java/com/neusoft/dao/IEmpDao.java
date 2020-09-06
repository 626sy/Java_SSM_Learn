package com.neusoft.dao;

import com.neusoft.domain.Emp;

import java.util.List;

public interface IEmpDao {
    // 查询所有
    List<Emp> findAll();

    Emp findById(Integer id);

    void saveEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(Integer id);
}
