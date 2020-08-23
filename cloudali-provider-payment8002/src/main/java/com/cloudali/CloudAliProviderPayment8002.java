package com.cloudali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Admin
 * @create: 2020/7/21 15:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliProviderPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliProviderPayment8002.class, args);
    }
}
