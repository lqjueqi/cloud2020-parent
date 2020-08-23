package com.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author: Admin
 * @create: 2020/7/12 13:35
 */
//@Configuration
public class MybatisConfig {

    @Bean //自定义myabtis的配置规则
    public ConfigurationCustomizer configurationCustomizer(){
        return (configuration)-> configuration.setMapUnderscoreToCamelCase(true);
//        return new ConfigurationCustomizer(){
//            @Override
//            public void customize(org.apache.ibatis.session.Configuration configuration) {
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
    }
}
