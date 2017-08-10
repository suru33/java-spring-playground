package com.suru.springtest.aopex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex3.model.Camera;
import com.suru.springtest.aopex3.model.Car;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex3/beans.xml");

		Camera bean = context.getBean("cam", Camera.class);
		
		Car car = context.getBean("car", Car.class);
		
		bean.snap();
		bean.snap(1000);
		bean.snapMode("night");

		car.start();
		
		context.close();
	}

}
