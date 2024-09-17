package com.spring.AOP.Homework.Spring.AOP.Homework.validator;

import com.spring.AOP.Homework.Spring.AOP.Homework.annotations.ValidEmployee;
import com.spring.AOP.Homework.Spring.AOP.Homework.entity.Employee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeValidator implements ConstraintValidator<ValidEmployee, Employee> {
    public boolean isValid(Employee employee, ConstraintValidatorContext context){
        if(employee == null){
            return false;
        }
        return employee.getName() != null && !employee.getName().isEmpty() && employee.getAge() >0;
    }
}
