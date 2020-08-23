package com.cloudali.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Admin
 * @create: 2020/7/22 20:15
 */
@FeignClient(value = "cloudali-provider-payment",fallback = PaymentFallBackServiceFeign.class)
public interface PaymentServiceFeign {

    @GetMapping("/paymnet/{id}")
    public String get(@PathVariable("id") String id);
}
