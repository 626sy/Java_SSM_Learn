package com.neusoft.dao.impl;

import com.neusoft.dao.IEmpDao;
import com.neusoft.po.Emp;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/16 10:06
 */
public class IEmpDaoImpl implements IEmpDao {
    static SqlSessionFactory factory;
    SqlSession sqlSession = factory.openSession();
    @Override
    public int addEmp(Emp emp) {

        sqlSession.insert("");

        return 0;
    }

    @Override
    public int modEmp(Emp emp) {
        sqlSession.update("");

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
    sqlSession.commit();
    sqlSession.close();
}
