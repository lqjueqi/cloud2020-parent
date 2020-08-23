package com.java8.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @author: Admin
 * @create: 2020/7/14 17:05
 */
public class TestLambda<S> {

    //匿名内部类
    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> ts =new TreeSet<>(com);
    }

    //Lambda 表达式
    @Test
    public void test2() {
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> ts =new TreeSet<>(com);

        List<Employee> list=new ArrayList<>();
        Employee e=new Employee();
        Supplier<Integer> s =e::getId;
        System.out.println(s.get());
        list.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    @Test
    public void test3() throws Exception {
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        new Thread(()->{
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"a").start();

        TimeUnit.SECONDS.sleep(1);
        new Thread(()->{
            try {
                phone1.sendSms();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"b").start();

        TimeUnit.SECONDS.sleep(2);
    }

    public void test4() {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Callable<Object> callable=()->{return 1;};
        Future<Object> submit = pool.submit(callable);
        FutureTask futureTask;
    }

    static class Phone{
        public static synchronized void sendEmail() throws Exception {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"---sendEmail()");
        }
        public static synchronized void sendSms() throws Exception{
            System.out.println(Thread.currentThread().getName()+"---sendSms()");
        }

    }


}
