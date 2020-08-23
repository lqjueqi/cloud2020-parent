package com.springboot.exception;

/**
 * @author: Admin
 * @create: 2020/7/10 17:58
 */
public class UserNotExistERxception  extends RuntimeException{
    public UserNotExistERxception() {
        super("用户不存在");
    }
}
