package com.javasession.polymorphism;

public class Horse extends Animal{
	
	public static void main(String[] args) {
		
		Animal obj = new Horse();
		
	}
	
	@Override //this is ANNOTATION! 
	public void sound() {
		System.out.println("Sound from a horse");
	}
	@Override
	public void move() {
		System.out.println("Horse move");
	}
}
