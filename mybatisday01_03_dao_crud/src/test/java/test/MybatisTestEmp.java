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
import java.util.Date;
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
    @Test
    public void testFindAll(){
        List<Emp> emps = iEmpDao.findAll();
        for (Emp emp :emps) {
            System.out.println(emp);
        }
    }
    // 查询根据empno
    @Test
    public void testFindByEmpno(){
        Emp emp = new Emp();
        emp.setEmp_no(7900);
        Emp byEmpno = iEmpDao.findByEmpno(emp.getEmp_no());
        System.out.println(byEmpno);
    }

    // 增加用户
    @Test
    public void testSaveEmp(){
        Emp emp = new Emp();
//        emp.setEmp_no(9999);
        emp.setE_name("李白");
        emp.setMgr(8888);
        emp.setE_job("SALESMAN");
        emp.setHiredate(new Date());
        emp.setSal(5000);
        emp.setComm(0);
        emp.setDept_no(40);

        int i = iEmpDao.saveEmp(emp);
        System.out.println(i);

    }

    // 更新用户
    @Test
    public void testUpdateEmp(){
        Emp emp = new Emp();
        emp.setEmp_no(10000);
        emp.setE_name("张飞");
        emp.setMgr(8888);
        emp.setE_job("SALESMAN");
        emp.setHiredate(new Date());
        emp.setSal(6000);
        emp.setComm(0);
        emp.setDept_no(40);

        int i = iEmpDao.updateEmp(emp);
        System.out.println(i);
    }

    // 删除用户
    @Test
    public void testDeleteEmp(){
        Emp emp = new Emp();
        emp.setEmp_no(9999);
        iEmpDao.deleteEmp(emp);
    }

    // 根据job进行模糊查询
    @Test
    public void testLikeJob(){

        List<Emp> emps = iEmpDao.findLikeJob("%A%");
        for (Emp emp:emps){
            System.out.println(emp);
        }
    }

    //    查询总记录数-->
    @Test
    public void testCount(){
        int total = iEmpDao.findTotal();
        System.out.println(total);
    }

    // 根据传参条件多条件查询
    @Test
    public void testFindByCondition(){
        Emp emp = new Emp();
        emp.setE_job("CLERK");
        emp.setDept_no(20);
        List<Emp> emps = iEmpDao.findByCondition(emp);
        for (Emp e:emps){
            System.out.println(e);
        }
    }

}
