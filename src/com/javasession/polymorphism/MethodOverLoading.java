package com.javasession.polymorphism;

public class MethodOverLoading extends OverLoad {
	public static void main(String[] args) {
		
		OverLoad ov = new OverLoad();
		double result;
		
		ov.demo(10);
		ov.demo(12,34);
		result = ov.demo(10.4);
		
		System.out.println("OOP " + result);
		
		DisplayOverLoading overLoad = new DisplayOverLoading();
		overLoad.desp('A');
		overLoad.desp('B', 45);
		
		Constructor ct = new Constructor();
		Constructor ct1 = new Constructor(12, 3, 4, true);
		
		
		
	}
	@Override
	public void demo(int a, int b) {
		System.out.println("A + B" + a + ", " + b);
	}
}
