package com.shsxt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @RequestMapping("user/find")
    public String find() {
        return "Hello";
    }

    @RequestMapping("login")
    public String login(String userName, String password, HttpSession session) {
        // 。。。登录成功
        session.setAttribute("userName", userName);
        session.setMaxInactiveInterval(60);
        return "login success";
    }
}
