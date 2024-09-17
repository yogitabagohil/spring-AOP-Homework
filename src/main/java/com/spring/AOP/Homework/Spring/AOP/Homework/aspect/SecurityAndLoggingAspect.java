package com.spring.AOP.Homework.Spring.AOP.Homework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Aspect
@Component
public class SecurityAndLoggingAspect {
    private static  final Logger logger = LoggerFactory.getLogger(SecurityAndLoggingAspect.class);

    @Before("execution(* com.spring.AOP.Homework.Spring.AOP.Homework..*(..))")
    public void logBeforeMethod(){
        logger.info("Method execution started.");
    }

    @After("execution(* com.spring.AOP.Homework.Spring.AOP.Homework..*(..))")
    public  void  logAfterMethod() {
        logger.info("Method execution completed.");
    }
    @Around("execution(* com.spring.AOP.Homework.Spring.AOP.Homework..*(..)) && @annotation(com.spring.AOP.Homework.Spring.AOP.Homework.annotations.Secure)")
    public  Object checkSecurityToken(ProceedingJoinPoint joinPoint) throws  Throwable {
        String token = "valid_token";
        if (!"valid_token".equals(token)){
            throw new SecurityException("Invalid Token");
        }
        return joinPoint.proceed();

    }
}
