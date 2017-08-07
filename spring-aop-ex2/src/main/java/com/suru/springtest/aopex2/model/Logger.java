package com.suru.springtest.aopex2.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(void com.suru.springtest.aopex2.model.Camera.snap())")
	public void cameraSnap() {
		// dummy method for reusable pointcut
	}

	@Pointcut("execution(String com.suru.springtest.aopex2.model.Camera.snapReturn())")
	public void afterReturnSnap() {
		// dummy method for reusable pointcut
	}

	@Pointcut("execution(void com.suru.springtest.aopex2.model.Camera.throwSnap())")
	public void afterThrowSnap() {
		// dummy method for reusable pointcut
	}

	@Pointcut("execution(void com.suru.springtest.aopex2.model.Camera.aroundSnap())")
	public void aroundSnap() {

	}

	@Before("cameraSnap()")
	public void beforeSnap() {
		System.out.println("> before snap");
	}

	@After("cameraSnap()")
	public void afterSnap() {
		System.out.println("> after snap");
	}

	@AfterReturning("afterReturnSnap()")
	public void afterReturn() {
		System.out.println("> after return value");
	}

	@AfterThrowing("afterThrowSnap()")
	public void afterThrow() {
		System.out.println("> exception");
	}

	@Around("aroundSnap()")
	public void around(ProceedingJoinPoint joinPoint) {
		System.out.println("> before around");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("** in around exception: " + e.getMessage() + " **");
			e.printStackTrace();
		}
		System.out.println("> after around");
	}

}
