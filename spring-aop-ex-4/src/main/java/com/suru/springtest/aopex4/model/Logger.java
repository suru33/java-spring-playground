package com.suru.springtest.aopex4.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	// @Pointcut("within(com.suru.springtest.aopex4.model.Car)")
	// public void withinCar() {
	// }

	@Pointcut("target(com.suru.springtest.aopex4.model.Car)")
	public void targetCar() {
	}

	@Pointcut("@annotation(com.suru.springtest.aopex4.annotations.TestAnnotation)")
	public void testAnnotation() {
	}

	// spring bean "woo"
	// also accept wild cards in bean name
	@Pointcut("bean(woo)")  
	public void beanTest() {

	}

	// @Before("withinCar()")
	// public void withinBeforeCar() {
	// System.out.println("** withinBeforeCar **");
	// }

	@Before("targetCar()")
	public void targetCarAdvice() {
		System.out.println("** target **");
	}

	@Before("testAnnotation()")
	public void testAnnotaionBefore() {
		System.out.println("** test annotaion log **");
	}

	@Before("beanTest()")
	public void testBeanBefore() {
		System.out.println("** test bean before **");
	}

}
