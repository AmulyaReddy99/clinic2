package com.example.demo.utils;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

	@Before("execution(public String user())")
	public void log_user() {
		System.out.println("Before user");
	}
	
}
