package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试controller
 *
 * @author shenjg
 * @date 2018/09/15
 **/
@Controller
public class HelloController {

    @RequestMapping("/login")
    public String index() {
        return "login";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
