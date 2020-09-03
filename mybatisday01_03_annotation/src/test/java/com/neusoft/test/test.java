package com.neusoft.test;

import com.neusoft.dao.IUserDao;
import com.neusoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/3 15:07
 */
public class test {
    @Test
    public void test1() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource);
        SqlSession session = factory.openSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        List<User> users = dao.findAll();
        for (User user:users
             ) {
            System.out.println(user);
        }

    }
}
