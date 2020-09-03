package com.neusoft.dao;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    // 查询所有
    @Select("select * from user")
    List<User> findAll();
    @Update("")
    public User updateUser();
    @Insert("insert into user values(?,?,?,?,?)")
    public User addAll();
}
