package com.cims.aops;

import com.cims.Annotations.CarAction;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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

    @Pointcut("execution(* com.cims.domain.cars.impl.BMW.getCarname(..))")
    public void annotationCarPointCut() {}


    @Before("performance()")
    public void before() {
        System.out.println("报上你的名字");
    }

    @After("performance()")
    public void after() {
        System.out.println("已经知道了你的名字");
    }

    @Before("annotationCarPointCut()")
    public void beforeBMW(JoinPoint jp) {
        MethodSignature signature = (MethodSignature)jp.getSignature();
        Method method = signature.getMethod();
//        CarAction action = method.getAnnotation(CarAction.class);
//        String name = action.name();
//        System.out.println("注解上的名字：" + name);
        System.out.println("目标方法名为：" + method.getName());
        System.out.println("目标方法所属类的简单类名：" + signature.getDeclaringType().getSimpleName());
        System.out.println("目标方法所属的类名：" + signature.getDeclaringTypeName());
        System.out.println("目标方法声明类型" + Modifier.toString(signature.getModifiers()));
    }
}
