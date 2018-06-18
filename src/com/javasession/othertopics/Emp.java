package com.javasession.othertopics;
/*
 * 
 * About static binding.
 * 
 */
public class Emp extends Human{
	public static void main(String[] args) {
		
		Human obj = new Emp();
		Human obj2 = new Human();
		
		obj.walk();
		obj2.walk();
		
		obj.walk2();
		obj2.walk2();
		
		
	}
	
	public static void walk() {
		System.out.println("Emp can walk");
	}
	
	public void walk2() {
		System.out.println("Emp can walk");
	}
}
/*	Static bind: 1. Static method itself 2. Private 3. Final
 	When the method is private static, final static. 
 	It must be static binding. It refers to the parent's method.
 */
class Human{
	public static void walk() {
		System.out.println("Human can walk");
	}
	public void walk2() {
		System.out.println("Human can walk");
	}
}
