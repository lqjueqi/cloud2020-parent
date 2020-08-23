package com.undertow.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Admin
 * @create: 2020/8/20 17:53
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hello")
    public String hello() {return "hello, port:" + serverPort;}
}
