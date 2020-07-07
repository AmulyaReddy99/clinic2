package com.example.demo.utils;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


//Advice -> Where (before, after)
//PointCut -> What (which function)

@Component
@Aspect
@EnableAspectJAutoProxy
public class UtilityComponent {

	@Before("execution(public String hello())")
	public void log() {
		System.out.println("Before hello");
	}

	@After("execution(public String use*())")
	public void ForUse() {
		System.out.println("Before anything that starts with use");
	}
	
	@After("allGetters()) && allMethodsInHello()")
	public void anyUse() {
		System.out.println("Before anything that starts with use");
	}
	
	@After("allGetters())")
	public void getUse(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget());
	}
	
//	@AfterReturning("args(name)")
//	public void stringArgs(String name) {
//		System.out.println("all string args called with name "+name);
//	}
	
//	@AfterThrowing("args(name)")
//	public void error(String err) {
//		System.out.println("Caught error "+err);
//	}
	
	@Around("allGetters()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnVal = null;
		// before executing below lines are executed
		try {
			
			// we may completely skip executing the block as well by not mentioning the below line
			returnVal = proceedingJoinPoint.proceed();
			
			// after executing above lines below are executed
		}catch(Throwable e) {
			
		}
		return returnVal;
		
	}
	
	@Pointcut("execution(public String use*())")
	public void allGetters() {}
	
	@Pointcut("within(com.example.demo.hello.Hello)")
	public void allMethodsInHello() {}
	
	
}
