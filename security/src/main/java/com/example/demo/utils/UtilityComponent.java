package com.example.demo.utils;

import java.util.List;

import org.aspectj.lang.annotation.After;
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
	
	@After("allGetters())")
	public void anyUse() {
		System.out.println("Before anything that starts with use");
	}
	
	@After("allGetters())")
	public void getUse() {
		System.out.println("Before anything that starts with use");
	}
	
	@Pointcut("execution(public String use*())")
	public void allGetters() {}
	
}
