package com.hhf.service;

import com.hhf.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有账户
    List<Account> findAll();

    //保存账户信息
    void seveAccount(Account account);
}
