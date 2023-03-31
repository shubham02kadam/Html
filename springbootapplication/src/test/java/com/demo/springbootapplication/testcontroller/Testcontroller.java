package com.demo.springbootapplication.testcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.springbootapplication.Repository.EmployeeRepo;
import com.demo.springbootapplication.entity.Employee;

@SpringBootTest
public class Testcontroller {
   @Autowired
    private EmployeeRepo repo;
@Test
public void testById(){

    Employee emp= new Employee();
    emp.setEmpId(1);
    emp.setEmpFirstName("shubham");
    emp.setEmpLastName("kadam");
    emp.setEmail("shubham@gmail.com");
    repo.save(emp);

    assertNotNull(repo.findById(1).get());
 
       

    }


    
}
