package com.springboot.repository;

import com.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Admin
 * @create: 2020/7/12 15:38
 */
public interface UserRepository  extends JpaRepository<User,Integer> {

}
