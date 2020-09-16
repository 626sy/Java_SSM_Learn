package com.neusoft.service.impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.dao.ILog;
import com.neusoft.po.Emp;
import com.neusoft.service.IEmpService;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/16 10:16
 */
public class IEmpServiceImpl implements IEmpService {
    IEmpDao empDao;
    ILog log;
    @Override
    public int addEmp(Emp emp) {
        int i = empDao.addEmp(emp);
        if (i>0){
            int j = log.addLog(emp);
            if (j==0){
                while (1>empDao.delEmp(emp.getEmpid()));
            }
        }
        return 0;
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
    public List<Emp> allEmp(Emp emp) {
        return null;
    }

    @Override
    public Emp getEmp(int empid) {
        return null;
    }
}
