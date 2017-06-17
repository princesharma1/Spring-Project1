package com.autowire;

public class B {
	private int id;
	

	public B(int id) {
		super();
		this.id = id;
		System.out.println("B is created.");
	}

	B() {
		System.out.println("B is created.");
	}

	public void print() {
		System.out.println("Hello B." + id);
	}
}
