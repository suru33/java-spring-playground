package com.suru.springtest.aopex5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex5.model.Car;
import com.suru.springtest.aopex5.model.TestPcdBean;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex5/beans.xml");

		TestPcdBean bean = context.getBean("test", TestPcdBean.class);

		bean.test1();
		bean.test2(100);
		bean.test3(989, 89.26);
		bean.test4("qwerty", "asdfg", -87, 44.22);
		bean.test5(new Car(), 45);

		context.close();
	}

}
