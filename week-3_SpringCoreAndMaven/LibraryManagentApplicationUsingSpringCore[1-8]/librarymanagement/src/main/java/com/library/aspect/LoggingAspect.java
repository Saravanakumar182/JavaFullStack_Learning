package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long duration = System.currentTimeMillis() - start;
        System.out.println("Method " + joinPoint.getSignature() + " executed in " + duration + "ms");

        return proceed;
    }
    @Before("execution(* com.library.service.*.*(..))")
    public void beforeAdvice() {
        System.out.println("Before method execution");
    }

    @After("execution(* com.library.service.*.*(..))")
    public void afterAdvice() {
        System.out.println("After method execution");
    }
}
