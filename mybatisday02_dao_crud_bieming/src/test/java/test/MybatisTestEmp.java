package test;


import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import com.neusoft.domain.User;
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
 * @date 2020/9/4 10:31
 */
public class MybatisTestEmp {

    private InputStream in;
    private SqlSession sqlSession;
    private IEmpDao iEmpDao;
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        sqlSession = factory.openSession();
        iEmpDao = sqlSession.getMapper(IEmpDao.class);
    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    // 查询所有
//    @Test
//    public void testFindAll(){
//        List<Emp> emps = iEmpDao.findAll();
//        for (Emp emp :emps) {
//            System.out.println(emp);
//        }
//    }
    // 查询根据empno
    @Test
    public void testFindByEmpno(){
        Emp emp = new Emp();
        emp.setEmpno(7900);
        Emp byEmpno = iEmpDao.findByEmpno(emp.getEmpno());
        System.out.println(byEmpno);
    }

}
