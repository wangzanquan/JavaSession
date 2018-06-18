package com.javasession.AbstractClass;

//abstract class is always PUBLIC, and the method must be public
abstract class Animal {
	
	public abstract void sound();
	
	public void myMethod() {
		System.out.println("Hello");
	}
	
}

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Cat sound");
	}
	public static void main(String[] args) {
		Cat ob = new Cat();
		ob.sound();
	}
}