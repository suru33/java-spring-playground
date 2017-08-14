package com.suru.springtest.aopex4.model;

import org.springframework.stereotype.Component;

@Component("woo")
public class WooferBean {
	public void testBeanMethod() {
		System.out.println("test bean content");
	}
}
