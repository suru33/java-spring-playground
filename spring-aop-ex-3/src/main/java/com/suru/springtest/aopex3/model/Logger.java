package com.suru.springtest.aopex3.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(void com.suru.springtest.aopex3.model.Camera.snap())")
	public void camaraSnap() {
	}

	@Before("camaraSnap()")
	public void beforeSnap() {
		System.out.println("** before snap **");
	}
}
