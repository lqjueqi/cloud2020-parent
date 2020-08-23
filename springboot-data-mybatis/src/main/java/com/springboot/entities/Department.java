package com.springboot.entities;

/**
 * @author: Admin
 * @create: 2020/7/12 12:20
 */
public class Department{
    private Integer id;
    private String departmentName;

    public Department() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
