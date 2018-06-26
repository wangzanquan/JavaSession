package com.javasession.lambda;

public class MethodRefPartOne {
	
	public static void printMessage() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		Thread task  = new Thread(MethodRefPartOne :: printMessage);
		task.start();
		
		
		
	}

}
