package com.demo.springbootapplication.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springbootapplication.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Serializable> {
    
}
