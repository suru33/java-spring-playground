package com.suru.springtest.aopex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex2.model.Camera;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex2/beans.xml");

		Object bean2 = context.getBean("cam");
		System.out.println(bean2.getClass());
		
		Camera bean = context.getBean("cam", Camera.class);
		bean.snap();
		System.out.println(bean.snapReturn());
		// try {;
		// bean.throwSnap();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		bean.aroundSnap();
		context.close();
	}

}
