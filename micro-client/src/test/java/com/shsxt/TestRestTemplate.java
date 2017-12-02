package com.shsxt;

import junit.runner.BaseTestRunner;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class TestRestTemplate {

    @Test
    public void test01() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://map.baidu.com/?newmap=1&reqflag=pcmap&biz=1&from=webmap&da_par=direct&pcevaname=pc4.1&qt=s&da_src=searchBox.button&wd=美食&c=289&src=0&wd2=&sug=0&l=15", String.class);
        System.out.println(result);
    }

    @Test
    public void test02() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8081/user/find", String.class);
        System.out.println(result);
    }
}
