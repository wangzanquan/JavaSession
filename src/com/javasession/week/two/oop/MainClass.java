package com.javasession.week.two.oop;

class MainClass {
	MainClass(){
		System.out.println("from main class");
	}
	void decp() {
		System.out.println("main method from main class");
	}
	public static void main(String[] args) {
		Example ex = new Example();
		ex.decp();
	}
	
}

class Example extends MainClass{
	Example(){
		System.out.println("from example class");
	}
	void decp() {
		System.out.println("method from example class");
		super.decp();
	}

}
