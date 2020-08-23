package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author: Admin
 * @create: 2020/7/12 12:10
 */
@SpringBootApplication
@MapperScan(value = "com.springboot.mapper") //扫描所有mapper接口
@EnableCaching
public class SpringbootDataMybatisApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatisApp.class,args);
    }
}
