package com.demo.springbootapplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springbootapplication.Repository.EmployeeRepo;
import com.demo.springbootapplication.entity.Employee;

import scala.collection.immutable.List;

@Service
public class Employeeservice {
    @Autowired
    private EmployeeRepo repo;

    public Employee saveAllEmployeedata(Employee emp){

       return repo.save(emp);
    }

   public Employee getByIdEmployee(Integer EmpId){

       Optional<Employee>find= repo.findById(EmpId);
       if (find.isPresent()) {
            
        Employee emp=   find.get();
        return emp;
        
       }

       return null;
   }
    
}
