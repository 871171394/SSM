package com.hhf.service.impl;

import com.hhf.dao.AccountDao;
import com.hhf.domain.Account;
import com.hhf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    public AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有的账户...");
        return accountDao.findAll();
    }

    @Override
    public void seveAccount(Account account) {
        System.out.println("业务层:保存账户...");
        accountDao.seveAccount(account);
    }
}
