package com.suru.springtest.aopex2.model;

import org.springframework.stereotype.Component;

@Component("cam")
public class Camera implements DummyInterface {

	public Camera() {
		System.out.println("~~~ Camera constructor ~~~");
	}

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
