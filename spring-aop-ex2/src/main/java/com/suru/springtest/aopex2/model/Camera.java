package com.suru.springtest.aopex2.model;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	public void snap() {
		System.out.println("SNAP!");
	}

}
