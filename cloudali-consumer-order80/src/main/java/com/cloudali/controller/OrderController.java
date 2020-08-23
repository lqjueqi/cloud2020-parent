package com.cloudali.controller;

import com.cloudali.feign.PaymentServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Admin
 * @create: 2020/7/21 15:27
 */
@RestController
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Autowired
    private PaymentServiceFeign paymentServiceFeign;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/paymnet/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/payment/nacos" + id, String.class);
    }

    @GetMapping("/consumer/paymnet/{id}")
    public String get(@PathVariable("id") String id) {
        return paymentServiceFeign.get(id);
    }
}
