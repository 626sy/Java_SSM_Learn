package com.neusoft.test;


import com.neusoft.dao.IUserDao1;
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
 * @date 2020/9/3 10:13
 */
public class MybatisTest2 {
    @Test
    public void test1() throws IOException {
        // 1、读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2、创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3、使用 工厂生产的SqlSession对象
        SqlSession session = factory.openSession();
        // 4、使用SqlSession 创建Dao 接口的代理对象
        IUserDao1 userDao = session.getMapper(IUserDao1.class);
        // 5、使用代理对象指向方法
        List<User> users = userDao.findAll();
        // 遍历
        for (User user:users) {
            System.out.println(user);
        }
        // 6、释放资源
        session.close();
        in.close();

    }




}
