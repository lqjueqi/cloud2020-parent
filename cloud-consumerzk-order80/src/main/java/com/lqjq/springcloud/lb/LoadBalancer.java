package com.lqjq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther: lq
 * @create: 2020/6/30 12:46
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> instances);
}
