package com.rpc02;

import com.common.IUserService;
import com.common.User;

/**
 * @author: Admin
 * @create: 2020/8/14 21:22
 */
public class UserServiceImpl  implements IUserService {
    @Override
    public User findUserById(Integer id) {
        return new User(id, "user");
    }
}
