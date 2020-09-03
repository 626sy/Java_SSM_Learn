package test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import neusoft.dao.IUserDao;
import neusoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/3 10:13
 */
public class MybatisTest1 {
//    @Test
//    public void test1() throws IOException {
//        // 1、读取配置文件
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        // 2、创建 SqlSessionFactory 工厂
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        // 3、使用 工厂生产的SqlSession对象
//        SqlSession session = factory.openSession();
//        // 4、使用SqlSession 创建Dao 接口的代理对象
//        IUserDao userDao = session.getMapper(IUserDao.class);
//        // 5、使用代理对象指向方法
//        List<User> users = userDao.findAll();
//        // 遍历
//        for (User user:users) {
//            System.out.println(user);
//        }
//        // 6、释放资源
//        session.close();
//        in.close();
//
//    }

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;
    // 在测试方法之前执行
    @Before
    public void init() throws IOException{
        // 1、读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2、创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3、使用 工厂生产的SqlSession对象
        sqlSession = factory.openSession();
        // 4、使用SqlSession 创建Dao 接口的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }
    @After
    public void destory() throws IOException {
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        for (User user:users){
            System.out.println(user);
        }
    }
    @Test
    public void testFindOne(){
        User user = userDao.findById(45);
        System.out.println(user);
    }






}
