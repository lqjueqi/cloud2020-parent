package com.cloudali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Admin
 * @create: 2020/7/21 14:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliProviderPayment8001.class, args);
    }
}
