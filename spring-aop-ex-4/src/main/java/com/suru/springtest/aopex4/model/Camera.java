package com.suru.springtest.aopex4.model;

import org.springframework.stereotype.Component;

import com.suru.springtest.aopex4.annotations.TestAnnotation;

@Component("cam")
public class Camera {

	@TestAnnotation
	public void testAnnotaionSnapper() {
		System.out.println("test annotaion snapper");
	}

}
