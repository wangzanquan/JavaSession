package com.javasession.week.two.tryandcatch;

public class TryMultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int num[ ] = {23,34,45,56,67,78};
			num[7] = 20/0;
			/*
			   Throw the first matched exception.
			 */
		}catch(ArithmeticException e) {
			System.out.println("An error ouccured with number");
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("index out of bound error");
		}catch(Exception e2) {
			System.out.println("Some Exceptions");
		}
		
		System.out.print("end of all Exceptions");
	}
	
}
