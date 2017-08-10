package com.suru.springtest.aopex3.model;

import org.springframework.stereotype.Component;

@Component("cam")
public class Camera {
	public Camera() {
		System.out.println(">>! Camera Constructor");
	}

	public void snap() {
		System.out.println(">> Snap!!");
	}
}
