package com.suru.springtest.aopex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex3.model.Camera;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex3/beans.xml");

		Camera bean = context.getBean("cam", Camera.class);
		bean.snap();

		context.close();
	}

}
