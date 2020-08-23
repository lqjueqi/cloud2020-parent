package com.lqjq.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Admin
 * @create: 2020/7/5 21:14
 */
@Configuration
@MapperScan({"com.lqjq.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
