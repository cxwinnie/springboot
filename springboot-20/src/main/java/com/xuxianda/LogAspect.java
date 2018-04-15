package com.xuxianda;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Xianda Xu on 2018/4/15.
 */
@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.xuxianda..*.*(..))")
    public void logBefore(){
        System.out.println("method log done");
    }

    @After("execution(* com.xuxianda..*.*(..))")
    public void logAfter(JoinPoint point){
        System.out.println("method log done---"+point.getClass()+"---"+ Arrays.asList(point.getArgs())+"---"+point.getSignature());
    }

}
