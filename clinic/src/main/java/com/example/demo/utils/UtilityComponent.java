package com.example.demo.utils;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//import com.example.demo.controller.Details;

//Advice -> Where (before, after)
//PointCut -> What (which function)

@Component
@Aspect
@EnableAspectJAutoProxy
public class UtilityComponent {

	@Before("execution(public String insert())")
	public void log() {
		System.out.println("MongoDB insert");
	}

}
