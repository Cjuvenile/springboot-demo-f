package com.fd.springboot.mapper;

import com.fd.springboot.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    List<Employee> getEmployeeList();
}
