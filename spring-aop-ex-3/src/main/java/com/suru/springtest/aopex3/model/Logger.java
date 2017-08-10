package com.suru.springtest.aopex3.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	// used wild card chars in poincut expression
	// any method in Camera class with any return type and any number of args
	@Pointcut("execution(* com.suru.springtest.aopex3.model.Camera.*(..))")
	public void cameraSnap() {
	}

	@Pointcut("within(com.suru.springtest.aopex3.model.Car)")
	public void car() {
	}

	@Before("cameraSnap()")
	public void beforeSnap() {
		System.out.println("** before snap **");
	}

	@Before("car()")
	public void beforeCar() {
		System.out.println("** before car **");
	}
}
