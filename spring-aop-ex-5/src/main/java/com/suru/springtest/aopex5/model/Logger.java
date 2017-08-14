package com.suru.springtest.aopex5.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("log")
@Aspect
public class Logger {

	@Pointcut("args()")
	public void pointcutTest1() {
	}

	@Pointcut("args(int)")
	public void pointcutTest2() {
	}

	@Pointcut("args(int, ..)")
	public void pointcutTest3() {
	}

	@Pointcut("args(.., double)")
	public void pointcutTest4() {
	}

	@Before("pointcutTest1()")
	public void test1Before() {
		System.out.println("** test 1 before **");
	}

	@Before("pointcutTest2()")
	public void test2Before() {
		System.out.println("** test 2 before **");
	}

	@Before("pointcutTest3()")
	public void test3Before() {
		System.out.println("** test 3 before **");
	}

	@Before("pointcutTest4()")
	public void test4Before() {
		System.out.println("** test 4 before **");
	}
}
