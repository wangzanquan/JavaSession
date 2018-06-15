package com.javasession.polymorphism;

public class Constructor {
	int num1;
	int num2;
	double d1;
	boolean b2;
	
	//Constructor Overloading
	public Constructor() {
		super();
	}

	public Constructor(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public Constructor(int num1, int num2, double d1, boolean b2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.d1 = d1;
		this.b2 = b2;
	}
	
	
}
