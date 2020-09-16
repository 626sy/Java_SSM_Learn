package com.neusoft.dao.impl;

import com.neusoft.dao.ILog;
import com.neusoft.po.Emp;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author shihaobo
 * @date 2020/9/16 10:12
 */
public class ILogImpl implements ILog {
    static SqlSessionFactory factory;
    SqlSession sqlSession = factory.openSession();
    @Override
    public void addLog(Emp emp) {

        sqlSession.insert("");

    }
    sqlSession.commit();
    sqlSession.close();
}
