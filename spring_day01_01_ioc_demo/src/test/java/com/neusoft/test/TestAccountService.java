package com.neusoft.test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/5 14:09
 */
public class TestAccountService {
    // 查询所有
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        List<Account> allAccount = as.findAllAccount();
        for (Account account:allAccount){
            System.out.println(account);
        }
    }
    // 根据id进行查询
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(2);
        Account accountById = as.findAccountById(account.getId());
        System.out.println(accountById);
    }

    @Test
    public void testSaveAccount(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(4);
        account.setName("ddd");
        account.setMoney(800f);
        as.saveAccount(account);
    }

    @Test
    public void testUpdateAccount(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(6);
        account.setName("fff");
        account.setMoney(1000f);
        as.updateAccount(account);

    }

    @Test
    public void testDeleteAccount(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.deleteAccount(4);
    }

}
