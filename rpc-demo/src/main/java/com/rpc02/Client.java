package com.rpc02;

import com.common.IProductService;

/**
 * @author: Admin
 * @create: 2020/8/14 16:28
 */
public class Client {
    public static void main(String[] args) {
//        IUserService userService = (IUserService) Stub.getStub(IUserService.class);
//        System.out.println(userService.findUserById(111));
        IProductService productService= (IProductService) Stub.getStub(IProductService.class);
        System.out.println(productService.findProductById(123));

    }
}
