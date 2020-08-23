package com.lqjq.springcloud.controller;

import com.lqjq.springcloud.entities.CommonResult;
import com.lqjq.springcloud.entities.Payment;
import com.lqjq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther: lq
 * @create: 2020/6/28 15:55
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果:+" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功！,serverPort：" + serverPort, result);
        } else {
            return new CommonResult(400, "插入数据失败！", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果:" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功！,serverPort：" + serverPort, payment);
        } else {
            return new CommonResult(400, "没有对应记录，查询id:" + id, null);
        }
    }

    @GetMapping(value = "/payment/get")
    public CommonResult getPayments() {
        List<Payment> payments = paymentService.getPayments();
        if (payments != null) {
            return new CommonResult(200, "查询成功！,serverPort：" + serverPort, payments);
        } else {
            return new CommonResult(400, "没有记录", null);
        }
    }
}
