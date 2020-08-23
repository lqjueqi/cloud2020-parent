package com.springboot.entity;

import javax.persistence.*;

/**
 * @author: Admin
 * @create: 2020/7/12 15:33
 */
@Entity
@Table(name="tbl_user")
public class User {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Integer id;

    @Column(name = "last_name",length = 50)
    private String lastName;

    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
