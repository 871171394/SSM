package com.hhf.controller;

import com.hhf.domain.Account;
import com.hhf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有账户所有信息");
        //调用service的方法
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account.getName());
        }
        model.addAttribute("list",list);
//        return "redirect:/index.jsp"; 不使用解析器
        return "list";
    }

    /**
     * 保存
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.seveAccount(account);

            response.sendRedirect(request.getContextPath()+"/account/findAll/");

//        return "redirect:/index.jsp"; 不使用解析器
        return ;
    }
}
