package com.neusoft.service.Impl;

import com.neusoft.dao.IAccountDao;
import com.neusoft.dao.Impl.AccountDaoImpl;
import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/5 11:39
 */
//@Component("accountService")
//@Component()
    @Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAll();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
