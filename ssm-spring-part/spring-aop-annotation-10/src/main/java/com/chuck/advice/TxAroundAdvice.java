package com.chuck.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class TxAroundAdvice {
    @Around("com.chuck.pointcut.MyPointCut.pc()")
    public Object transaction(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            System.out.println("开启事务");
            result = proceedingJoinPoint.proceed(args);
            System.out.println("结束事务");
        } catch (Throwable e) {
            System.out.println("事务回滚");
            throw new RuntimeException(e);
        }
        return result;
    }
}
