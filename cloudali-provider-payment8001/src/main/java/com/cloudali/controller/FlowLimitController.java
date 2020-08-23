package com.cloudali.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: Admin
 * @create: 2020/7/21 21:14
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() throws Exception {
//        TimeUnit.MILLISECONDS.sleep(500);
        log.info(Thread.currentThread().getName()+"\t"+"...testA");
        return "------testA()";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"\t"+"...testA");
        return "------testB()";
    }

    @GetMapping("/testD")
    public String testD() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        //log.info("testD 测试RT");
        log.info("testD 测试异常比例");
        int i=10/0;
        return "------testD()";
    }

    @GetMapping("/testE")
    public String testE() throws Exception {
        log.info("testE 测试异常数");
        int i=10/0;
        return "------testE()";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                         @RequestParam(value = "p2",required = false) String p2){

        return "------testHotKey()";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "------deal_testHotKey(),o(╥﹏╥)o";
    }
}
