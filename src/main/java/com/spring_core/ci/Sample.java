package com.spring_core.ci;

import org.springframework.beans.factory.annotation.Value;

public class Sample {
	private int x;
	private int y;

	public Sample(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("int int");
	}

	public Sample(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("double double");
	}

	public Sample(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("String String");
	}

	public void doSum() {
		System.out.println(this.x + this.y);
		System.out.println("value of x is"+ this.x);
		System.out.println("value of y is"+ this.y);
	}
}
