package com.javasession.othertopics;
/*
 * 
 * Dynamic Binding
 * 
 */
public class SubClass extends SuperClass{

	int someNum = 40;
	
	void printNumber() {
		System.out.println(someNum);
		
		/*
		 * Print the variable in SuperClass
		 */
		System.out.println(super.someNum);
	}
	
	void display() {
		System.out.println("From Sub Class");
	}
	
	void printMag() {
		display();
		super.display();
	}
	
	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.printNumber();
		sb.printMag();
	}
	
}
 class SuperClass{
	 int someNum = 20;
	 
	 void display() {
		 System.out.println("From Super class");
	 }
	 
	 
 }