package com.fd.springboot.controller;

import com.fd.springboot.entity.Employee;
import com.fd.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/getEmployeeList")
    public List<Employee> getEmployeeList() {
        return employeeMapper.getEmployeeList();
    }
}

