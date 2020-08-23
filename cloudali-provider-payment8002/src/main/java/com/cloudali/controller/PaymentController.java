package com.cloudali.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cloudali.myhandler.CustomerBlockHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Admin
 * @create: 2020/7/21 15:21
 */
@RestController
@RefreshScope //支持Nacos动态刷新功能
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") String id){
        return "nacos registry, serverport: "+serverPort+"\t id"+id;
    }

    @GetMapping("/payment/{id}")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public String get(@PathVariable("id") String id){
        return "provider, serverport: "+serverPort+"\t id"+id;
    }

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }


    @GetMapping("/payment/lb")
    public String paymentLb(){
        return "nacos registry, serverport: "+serverPort;
    }

    @GetMapping("/payment/get/{id}")
    public String paymentget(@PathVariable("id") String id){
        return "serverPort: "+serverPort+"id:"+id;
    }
}
