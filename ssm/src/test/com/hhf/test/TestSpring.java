package com.hhf.test;

import com.hhf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        //加载Spring的配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService =(AccountService) ac.getBean("accountService");
        //调用方法
        accountService.findAll();
    }
}
