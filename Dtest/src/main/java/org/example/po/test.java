package org.example.po;

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
import java.util.Objects;

/**
 * @author shihaobo
 * @date 2020/9/10 15:01
 */
public class test {

    private String resource = "mybatis-config.xml";
    private InputStream inputStream;
    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
//     查询一个
/*    @Test
    public void testSelectOne(){
        Emp e = sqlSession.selectOne("org.example.po.Emp.getEmp");
        System.out.println(e);
    }

    @Test
    public void testSelectAll(){
        List<Emp> list = sqlSession.selectList("org.example.po.Emp.getEmp2");
//        for (Emp emp:list){
//            System.out.println(emp);
//        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }

    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setEname("liudehua");
        emp.setLogid("ttc4");
        int i = sqlSession.insert("org.example.po.Emp.addEmp",emp);
        System.out.println(emp);
        System.out.println("i"+i);
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setEmpid(11);
        emp.setEname("zhangsan");
        int i = sqlSession.update("org.example.po.Emp.updateEmp",emp);
        System.out.println("i"+i);
    }

    @Test
    public void delete(){
        int delete = sqlSession.delete("org.example.po.Emp.removeEmp", 12);
        System.out.println(delete);
    }

    @Test
    public void testLike(){
        Emp emp = new Emp();
        emp.setEname("%张%");
        List<Emp> list = sqlSession.selectList("org.example.po.Emp.likeEmp", emp);
        System.out.println(list);
        for (Emp e:list){
            System.out.println(e);
        }
    }*/

    @Test
    public void SelectDept(){
        List<Object> list = sqlSession.selectList("org.example.po.Dept.getAll");
        System.out.println(list);
    }
    @Test
    public void SelectDToOne(){
        List<Object> list = sqlSession.selectList("org.example.po.Emp.getEmp1");
        System.out.println(list);
    }

    @Test
    public void SelectDuoToDuo(){
        List<Object> list = sqlSession.selectList("org.example.po.Dept.getAllTwo");
        for (Object list1:list){
            System.out.println(list1);
        }
    }
}
