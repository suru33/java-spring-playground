package com.suru.springtest.aopex4.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	@Pointcut("within(com.suru.springtest.aopex4.model.*)")
	public void withinCar() {
	}

	@Pointcut("target(com.suru.springtest.aopex4.model.Car)")
	public void targetCar() {
	}

	@Before("withinCar()")
	public void withinBeforeCar() {
		System.out.println("** withinBeforeCar **");
	}

	@Before("targetCar()")
	public void targetCarAdvice() {
		System.out.println("** target **");
	}

}
