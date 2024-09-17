package com.spring.AOP.Homework.Spring.AOP.Homework.controller;

import com.spring.AOP.Homework.Spring.AOP.Homework.annotations.Secure;
import com.spring.AOP.Homework.Spring.AOP.Homework.annotations.TrackExecutionTime;
import com.spring.AOP.Homework.Spring.AOP.Homework.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    @TrackExecutionTime
    @Secure
    public Employee getEmployee(){
        return new Employee("AD", 35);
    }
}
