package com.spring_core.ci;

public class Person {
	private String name;
	private int id;
	private Certifi certi;

	public Person(String name, Integer id, Certifi certi) {
		this.name = name;
		this.id = id;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi.name + "]";
	}

	
	

}
