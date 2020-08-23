package com.cloudali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Admin
 * @create: 2020/7/23 15:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliGateway9527
{
    public static void main(String[] args) {
        SpringApplication.run(CloudAliGateway9527.class, args);
    }
}
