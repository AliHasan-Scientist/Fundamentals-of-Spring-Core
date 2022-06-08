package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Scientist implements InitializingBean, DisposableBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Scientist(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Scientist [id=" + id + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("intialization of object");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destruction of object");
	}
}
