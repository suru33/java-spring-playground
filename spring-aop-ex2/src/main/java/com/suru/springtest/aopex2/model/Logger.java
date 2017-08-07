package com.suru.springtest.aopex2.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(void com.suru.springtest.aopex2.model.Camera.snap())")
	public void cameraSnap() {

	}

	@Before("cameraSnap()")
	public void beforeSnap() {
		System.out.println("about to snap!");
	}

	@After("cameraSnap()")
	public void afterSnap() {
		System.out.println("snap done!");
	}
}
