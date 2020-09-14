package com.neusoft.service;

import com.neusoft.dao.IEmpDao;

/**
 * @author shihaobo
 * @date 2020/9/14 9:58
 */
public class EmpService {
    IEmpDao empDao;

    public void setEmpDao(IEmpDao empDao) {
        this.empDao = empDao;
    }
    public void addEmp(){
        empDao.addEmp();
    }
}
