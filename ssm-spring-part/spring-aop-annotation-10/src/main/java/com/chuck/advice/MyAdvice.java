package com.chuck.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Component
@Aspect
public class MyAdvice {
    @Before("execution(* com.chuck.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        System.out.println("simpleName = " + simpleName);
        int modifiers = joinPoint.getSignature().getModifiers();
        String s = Modifier.toString(modifiers);
        System.out.println("s = " + s);
        String name = joinPoint.getSignature().getName();
        System.out.println("name = " + name);
        Object[] args = joinPoint.getArgs();
        System.out.println("args = " + args);

    }
    @AfterReturning(value = "execution(* com.chuck.service.*.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("result = " + result);
    }
    @After("execution(* com.chuck.service.*.*(..))")
    public void after(JoinPoint joinPoint){

    }
    @AfterThrowing(value = "execution(* com.chuck.service.*.*(..))",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("throwable = " + throwable);
    }

}
