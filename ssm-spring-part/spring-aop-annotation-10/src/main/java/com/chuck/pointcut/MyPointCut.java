package com.chuck.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointCut {

    @Pointcut("execution(* com.chuck.service.*.*(..))")
    public void pc(){}
}
