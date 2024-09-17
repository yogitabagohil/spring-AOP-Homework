package com.spring.AOP.Homework.Spring.AOP.Homework.entity;

import com.spring.AOP.Homework.Spring.AOP.Homework.annotations.ValidEmployee;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Employee {
    @Setter
    @ValidEmployee
    private  String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
