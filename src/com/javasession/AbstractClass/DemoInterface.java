package com.javasession.AbstractClass;

public class DemoInterface implements MyInterface, SecondInterface{
	public void method1() {
		System.out.println("1");
	}
	
	public void method2() {
		System.out.println("2");
	}
	
	public void method3() {
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		MyInterface oj = new DemoInterface();
		oj.method1();
		oj.method2();
		
		SecondInterface oj2 = new DemoInterface();
		oj2.method3();
	}
	
}

interface MyInterface{
	//Without "abstract", java will treat it as abstracts
	public void method1();
	public void method2();
}

interface SecondInterface{
	public void method3();
}