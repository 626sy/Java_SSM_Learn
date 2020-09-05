package com.neusoft.service;

import com.neusoft.domain.Account;

import java.util.List;

public interface IAccountService {

    // 查询所有
    List<Account> findAllAccount();

    // 返回Account通过ID
    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

}
