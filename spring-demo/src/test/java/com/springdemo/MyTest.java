package com.springdemo;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Admin
 * @create: 2020/7/15 23:40
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);

    }
    @Test
    public void test2(){
        User user = new User(1,"zs",12);
        String str =JSON.toJSONString(user);
        System.out.println(str);
    }
}
