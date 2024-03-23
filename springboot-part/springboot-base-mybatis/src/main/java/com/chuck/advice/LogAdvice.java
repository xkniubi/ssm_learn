package com.chuck.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class LogAdvice {
    @Before("execution(* com..service.*.*(..))")
    public void before(JoinPoint point){
        String simpleName = point.getTarget().getClass().getSimpleName();
        String name = point.getSignature().getName();
        System.out.println("name = " + name);
        System.out.println("simpleName = " + simpleName);
    }
}
