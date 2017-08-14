package com.suru.springtest.aopex5.model;

public class Car {
	public void startCar() {
		System.out.println("%% car started!");
	}
	
	@Override
	public String toString() {
		return "%% car to string";
	}
}
