package com.suru.springtest.aopex3.model;

import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	public void start() {
		System.out.println(">> car starting!");
	}
	
	public void stop() {
		System.out.println(">> car stopped!");
	}
}
