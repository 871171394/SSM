package com.hhf.test;

import com.hhf.dao.AccountDao;
import com.hhf.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMappConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session =factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //查询所有账户信息
        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account.getName());
        }

        session.close();
        in.close();

    }

    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMappConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session =factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account=new Account();
        account.setName("牛逼");
        account.setMoney(5000D);
        //插入账户
        dao.seveAccount(account);

        //提交事务
        session.commit();

        //关闭资源
        session.close();
        in.close();

    }
}
