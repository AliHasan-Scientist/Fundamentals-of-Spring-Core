package com.springcore.lifecycle;

public class Butter {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting properties");
		this.price = price;
	}

	public Butter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Butter [price=" + price + "]";
	}

	public void journey() {
		System.out.println("I start my journey");
	}

	public void die() {
		System.out.println("I am going to die!");
	}

}
