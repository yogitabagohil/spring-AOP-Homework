package com.spring.AOP.Homework.Spring.AOP.Homework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeTrackerAspect {
    private  static final Logger logger = LoggerFactory.getLogger(ExecutionTimeTrackerAspect.class);
    @Around("@annotation(com.spring.AOP.Homework.Spring.AOP.Homework.annotations.TrackExecutionTime)")
    public Object trackExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        logger.info("Method: " + joinPoint.getSignature() + " executed in " + (endTime - startTime) + "ms");
        return result;
    }

}
