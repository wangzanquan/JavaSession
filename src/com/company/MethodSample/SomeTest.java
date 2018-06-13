package com.company.MethodSample;

import java.util.Scanner;

public class SomeTest {
	public static void main(String[] args){
		/*
		 Given two int values,
		 return their sum. Unless the two values are the same,
		 then return double their sum.
		 
		 sumDouble(1, 2) -> 3
		 sumDouble(3, 2) -> 5
		 sumDouble(2, 2) -> 8
		 */
		int num1;
		int num2;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First number");
		num1 = scan.nextInt();
		
		System.out.println("Enter the Second number");
		num2 = scan.nextInt();
				
		System.out.println("The sum is: " + sumDouble(num1, num2));
		
		
	}
	
	private static int sumDouble(int num1, int num2) {
		int sum;  
		if(num1 == num2) {
			return (num1 + num2) * 2;
		}else {
			return num1 + num2;
		}
		
		
	}
}
