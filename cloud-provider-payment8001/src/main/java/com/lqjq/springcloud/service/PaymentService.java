package com.lqjq.springcloud.service;

import com.lqjq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther: lq
 * @create: 2020/6/28 15:50
 */
public interface PaymentService {

    /**
     * 插入支付数据
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询支付信息
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);

    /**
     * 查询所有支付信息
     * @return
     */
    public List<Payment> getPayments();
}
