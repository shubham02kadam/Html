package com.demo.springbootapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootapplication.entity.Employee;
import com.demo.springbootapplication.service.Employeeservice;

@RestController
public class EmployeeController {
    @Autowired
    private Employeeservice ser;
    @PostMapping("/save")
    public Employee savEmployeeData(@RequestBody Employee emp){
      System.out.println(emp);
       return ser.saveAllEmployeedata(emp);
    }
     @GetMapping("/save/{EmpId}")
    public Employee getByIdEmployee(@PathVariable Integer EmpId){

       Employee emp=ser.getByIdEmployee(EmpId);
       return emp;
    }


    
}
