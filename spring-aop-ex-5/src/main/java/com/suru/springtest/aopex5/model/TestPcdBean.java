package com.suru.springtest.aopex5.model;

import org.springframework.stereotype.Component;

@Component("test")
public class TestPcdBean {

	public void test1() {
		System.out.println("-- test 1");
	}

	public void test2(int number) {
		System.out.println("-- test 2, int: " + number);
	}

	public void test3(int number, double anotherNumber) {
		System.out.println("-- test 3, int: " + number + ", double: " + anotherNumber);
	}

	public void test4(String text, String anotherText, int number, double anotherNumber) {
		System.out.println("-- test 4, String: " + text + ", String: " + anotherText + ", int: " + number + ", double: "
				+ anotherNumber);
	}

	public void test5(Car car, int number) {
		System.out.println("-- test 5, Car: " + car + ", int: " + number);
	}
}
