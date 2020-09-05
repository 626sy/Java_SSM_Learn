package com.neusoft.test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author shihaobo
 * @date 2020/9/5 14:09
 */
public class TestAccountService {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    private IAccountService as = ac.getBean("accountServiceImpl", IAccountService.class);
    // 查询所有
    @Test
    public void testFindAll(){
        List<Account> allAccount = as.findAllAccount();
        for (Account account:allAccount){
            System.out.println(account);
        }
    }
    // 根据id进行查询
    @Test
    public void testFindById(){
        Account account = new Account();
        account.setId(2);
        Account accountById = as.findAccountById(account.getId());
        System.out.println(accountById);
    }

    @Test
    public void testSaveAccount(){
        Account account = new Account();
//        account.setId(4);
        account.setName("ddd");
        account.setMoney(800f);
        as.saveAccount(account);
    }

    @Test
    public void testUpdateAccount(){
        Account account = new Account();
        account.setId(7);
        account.setName("fff");
        account.setMoney(1000f);
        as.updateAccount(account);

    }

    @Test
    public void testDeleteAccount(){
        as.deleteAccount(6);
    }

}
