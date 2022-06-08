package com.spring_core.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/ci/ciconfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println();
		Sample sample = (Sample) context.getBean("samp");
		sample.doSum();
	}
}
