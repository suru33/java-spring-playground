package com.suru.springtest.aopex4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex4.model.Car;

public class AppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex4/beans.xml");

		Car car = context.getBean("car", Car.class);
		car.startCar();
		car.stopCar();

		context.close();
	}
}
