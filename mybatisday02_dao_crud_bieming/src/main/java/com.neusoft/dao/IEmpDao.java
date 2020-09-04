package com.neusoft.dao;

import com.neusoft.domain.Emp;
import com.neusoft.domain.User;

import java.util.List;

public interface IEmpDao {

    // 查询所有员工信息
    List<Emp> findAll();
    // 查询根据empno
    Emp findByEmpno(Integer empno);
    //    增加保存用户
    int saveEmp(Emp emp);
    //    更新用户
    int updateEmp(Emp emp);
    //    删除用户
    int deleteEmp(Emp emp);
    //    根据job进行模糊查询
    List<Emp> findLikeJob(String job);
    //     /**
    //     * 保存用户  返回插入后自增长的id 在 user里面 不是这个返回值
    //     */
    //    int savaUser(User user);
    //    /**
    //     * 更新用户
    //     */
    //    int  updateUser(User user);
    //    /**
    //     * 删除用户
    //     */
    //    int deleteUser(Integer id);
    //    /**
    //     * 根据姓名进行模糊查询
    //     */
    //
    //    List<User> findByName(String  username);
    //    /**
    //     * 查询总记录数
    //     */
    //    int findTotal();

}
