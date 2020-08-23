package com.cloudali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Admin
 * @create: 2020/7/21 14:16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAliConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliConsumerOrder80.class, args);
    }
    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string;
        }
    }
}
