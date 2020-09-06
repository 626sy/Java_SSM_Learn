package com.neusoft.service;

import com.neusoft.domain.Emp;

import java.util.List;

public interface IEmpService {

    List<Emp> findAll();

    Emp findById(Integer id);

    void saveEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(Integer id);
}
