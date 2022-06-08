package com.spring_core.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
	}

}
