package com.spring.AOP.Homework.Spring.AOP.Homework.aspect;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class GlobalErrorHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalErrorHandler.class);

    @AfterThrowing(pointcut = "execution(* com.spring.AOP.Homework.Spring.AOP.Homework..*(..))", throwing = "ex")
    public void handleException(Exception ex){
        logger.error("Exception caught: " + ex.getMessage(), ex);
    }
}
