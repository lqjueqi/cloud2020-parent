package com.cloudali.feign;

import org.springframework.stereotype.Component;

/**
 * @author: Admin
 * @create: 2020/7/22 20:23
 */
@Component
public class PaymentFallBackServiceFeign implements PaymentServiceFeign {
    @Override
    public String get(String id) {
        return "服务降级！";
    }
}
