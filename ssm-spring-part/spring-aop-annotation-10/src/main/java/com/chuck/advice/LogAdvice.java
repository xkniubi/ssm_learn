package com.chuck.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

    @Before("com.chuck.pointcut.MyPointCut.pc()")
    public void start(){
        System.out.println("方法开始了");
    }
    @AfterReturning("com.chuck.pointcut.MyPointCut.pc()")
    public void after(){
        System.out.println("方法结束了");
    }
    @AfterThrowing("com.chuck.pointcut.MyPointCut.pc()")
    public void error(){
        System.out.println("方法报错了");
    }
}
