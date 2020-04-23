package com.fd.springboot.test;


import com.fd.springboot.SpringbootQuick3Application;
import com.fd.springboot.entity.Employee;
import com.fd.springboot.mapper.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringbootQuick3Application.class)
public class RepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    public void test(){
        List<Employee> list = employeeRepository.findAll();
        System.out.println("list.size() = " + list.size());
    }
}
