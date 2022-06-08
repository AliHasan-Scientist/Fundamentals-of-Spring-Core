package com.spring_core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/collections/empconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp.getAddressSet());
		System.out.println(emp.getPhonesList());
		System.out.println(emp.getCourseMap());
		System.out.println(emp.getProperties());
	}

}
