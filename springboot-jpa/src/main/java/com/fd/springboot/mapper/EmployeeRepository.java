package com.fd.springboot.mapper;

import com.fd.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
