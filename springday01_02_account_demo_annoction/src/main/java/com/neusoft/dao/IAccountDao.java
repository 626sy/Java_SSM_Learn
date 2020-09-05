package com.neusoft.dao;

import com.neusoft.domain.Account;

import java.util.List;

public interface IAccountDao {
    // 查询所有
    List<Account> findAll();
    // 查一个
    Account findAccountById(Integer id);
    // 增加
    void saveAccount(Account account);
    // 更新
    void updateAccount(Account account);
    // 删除
    void deleteAccount(Integer id);
}
