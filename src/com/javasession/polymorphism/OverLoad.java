package com.javasession.polymorphism;

public class OverLoad {
	void demo(int a) {
		System.out.println("A: " + a);
	}
	void demo(int a, int b) {
		System.out.println("A + B" + a + b);
	}
	double demo(double a) {
		System.out.println("Double A" + a);
		return a*a;
	}
}
