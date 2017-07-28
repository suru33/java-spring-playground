package com.suru.springtest.aopex1.model;

public class Logger {

	public void logMySnap() {
		System.out.println("about to snap!");
	}
	
	public void afterMySnap() {
		System.out.println("snap done!");
	}
}