package com.shsxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello/call")
    public String index() {

        // 调用服务端的user/find接口数据
        String result = restTemplate.getForObject("http://MICRO-SERVER/user/find", String.class);
        return result;
    }

    @RequestMapping("check")
    public String checkLogin( HttpSession session) {
        // 。。。登录成功
        String userName =  (String)session.getAttribute("userName");
        return userName;
    }

}
