package com.javasession.week.two.oop;

public class SampleTestClass extends SampleInheritance {
	public static void main(String[] args) {
		getOne();
	}
	
	static void getOne() {
		System.out.println("Say Hello");
		System.out.println(sumOfAll(6, 89));
	}
	private static int sumOfAll(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void message() {
		System.out.println("some test message");
	}
}
