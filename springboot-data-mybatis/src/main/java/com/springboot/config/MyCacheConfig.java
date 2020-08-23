package com.springboot.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author: Admin
 * @create: 2020/7/13 12:18
 */
@Configuration
public class MyCacheConfig {

    @Bean("MyKeyGenerator")
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            return method.getName() + "[" + Arrays.asList(params).toString() + "]";
        };
    }
}
