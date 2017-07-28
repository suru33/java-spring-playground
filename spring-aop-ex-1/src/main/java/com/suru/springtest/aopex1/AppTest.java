package com.suru.springtest.aopex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex1.model.Camera;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex1/beans.xml");

		Camera camera = context.getBean("camera", Camera.class);
		camera.snap();

		context.close();

	}

}
