package com.suru.springtest.aopex2.model;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	public void snap() {
		System.out.println("** SNAP! **");
	}

	public String snapReturn() {
		return "** return value **";
	}

	public void throwSnap() throws Exception {
		throw new Exception("** Exception throwed **");
	}
	
	public void aroundSnap() {
		System.out.println("** around snap **");
	}
	
}
