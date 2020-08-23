package com.lqjq.springcloud.service.impl;

import com.lqjq.springcloud.dao.PaymentMapper;
import com.lqjq.springcloud.entities.Payment;
import com.lqjq.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther: lq
 * @create: 2020/6/28 15:50
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }

    @Override
    public List<Payment> getPayments() {
        return paymentMapper.getPayments();
    }
}
