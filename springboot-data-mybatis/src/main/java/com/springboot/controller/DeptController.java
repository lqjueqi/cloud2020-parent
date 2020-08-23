package com.springboot.controller;

import com.springboot.entities.Department;
import com.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Admin
 * @create: 2020/7/12 12:36
 */
@RestController
public class DeptController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id }")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }
}
