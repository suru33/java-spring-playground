package com.suru.springtest.aopex4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex4.model.Camera;
import com.suru.springtest.aopex4.model.Car;
import com.suru.springtest.aopex4.model.WooferBean;

public class AppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex4/beans.xml");

		Car car = context.getBean("car", Car.class);
		car.startCar();
		car.stopCar();

		
		Camera camera = context.getBean("cam", Camera.class);
		camera.testAnnotaionSnapper();
		
		WooferBean wooferBean = context.getBean("woo", WooferBean.class);
		wooferBean.testBeanMethod();
		
		context.close();
	}
}
