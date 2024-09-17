package com.spring.AOP.Homework.Spring.AOP.Homework.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = com.spring.AOP.Homework.Spring.AOP.Homework.validator.EmployeeValidator.class)
public @interface ValidEmployee {
    String message() default  "Invalid employee data";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
