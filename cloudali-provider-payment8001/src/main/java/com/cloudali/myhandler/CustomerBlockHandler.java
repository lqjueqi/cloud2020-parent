package com.cloudali.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lqjq.springcloud.entities.CommonResult;

/**
 * @author: Admin
 * @create: 2020/7/22 16:10
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按各户自定义,global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按各户自定义,global handlerException---2");
    }
}
