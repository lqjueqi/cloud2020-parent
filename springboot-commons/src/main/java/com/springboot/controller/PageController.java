package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Admin
 * @create: 2020/7/9 22:09
 */
//@Controller
public class PageController {

    @GetMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
}
