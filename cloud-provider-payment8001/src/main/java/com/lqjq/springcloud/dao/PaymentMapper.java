package com.lqjq.springcloud.dao;

import com.lqjq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther zzyy
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentMapper
{
    public int create(Payment payment);

    //@Select("select * from payment where id=#{id}")
    public Payment getPaymentById(@Param("id") Long id);

    @Select("select * from payment")
    public List<Payment> getPayments();
}
