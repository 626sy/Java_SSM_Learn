package com.neusoft.service.Impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import com.neusoft.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/5 16:17
 */
//@Service
@Component("empService")
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpDao empDao;

    public void setEmpDao(IEmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }

    @Override
    public Emp findById(Integer id) {
        return empDao.findById(id);
    }

    @Override
    public void saveEmp(Emp emp) {
        empDao.saveEmp(emp);
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }

    @Override
    public void deleteEmp(Integer id) {
        empDao.deleteEmp(id);
    }
}
