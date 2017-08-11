package com.suru.springtest.aopex4.model;

import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	public void startCar() {
		System.out.println(">> car started");
	}

	public void stopCar() {
		System.out.println(">> car stopped");
	}
}
