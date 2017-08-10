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

	public void snap(int shutterTime) {
		System.out.println(">> snapped after " + shutterTime + " ms");
	}

	public void snapMode(String cameraMode) {
		System.out.println(">> snapped in " + cameraMode + " mode");
	}
}
