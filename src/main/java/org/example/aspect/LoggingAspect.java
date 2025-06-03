package org.example.aspect; // 这个类属于org.example.aspect包

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint; // 导入AOP相关类
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    // 定义一个切面类（类似“监控摄像头”）

    @Before("execution(* com.example.UserService.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Method " + joinPoint.getSignature().getName() + " is about to be called.");
    }


}