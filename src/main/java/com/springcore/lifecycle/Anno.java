package com.springcore.lifecycle;

public class Anno {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Anno(String type) {
		super();
		this.type = type;
	}

	public Anno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println("Start");
	}

	public void end() {
		System.out.println("end");
	}
}
