package com.fd.springboot.test;

import com.fd.springboot.SpringbootQuick2Application;
import com.fd.springboot.entity.Employee;
import com.fd.springboot.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQuick2Application.class)
public class MapperTest {
    @Autowired
    private EmployeeMapper employeeMapper;
  @Test
    public void test() {
        List<Employee> employeeList = employeeMapper.getEmployeeList();
        System.out.println(employeeList);
    }
}
