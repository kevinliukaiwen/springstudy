package com.cims.aops;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author kwliu
 * @Description 定义切面，包含切点和通知
 * @Date 2018/5/6
 * @Modified
 */
@Aspect
public class CarAOP {
    @Pointcut("execution(* com.cims.domain.cars.impl.Audi.getCarname(..))")
    public void performance() {}

    @Before("performance()")
    public void before() {
        System.out.println("报上你的名字");
    }

    @After("performance()")
    public void after() {
        System.out.println("已经知道了你的名字");
    }
}
