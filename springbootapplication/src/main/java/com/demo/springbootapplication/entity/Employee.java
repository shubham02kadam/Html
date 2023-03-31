package com.demo.springbootapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer EmpId;
    private String EmpFirstName;
    private String EmpLastName;
    private String Email;

    public Employee(Integer empId, String empFirstName, String empLastName, String email) {
        EmpId = empId;
        EmpFirstName = empFirstName;
        EmpLastName = empLastName;
        Email = email;
    }
    public Employee(){

        
    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer empId) {
        EmpId = empId;
    }

    public String getEmpFirstName() {
        return EmpFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        EmpFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return EmpLastName;
    }

    public void setEmpLastName(String empLastName) {
        EmpLastName = empLastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Employee [EmpId=" + EmpId + ", EmpFirstName=" + EmpFirstName + ", EmpLastName=" + EmpLastName
                + ", Email=" + Email + "]";
    }
    
    
}
