package com.company.MethodSample;

public class MethodTest {

		/*
		   The signature of a method: method name + parameter.
		 */
	public static void main(String[] args) {
		
		getSumOfAmount(8.99, 8,"Test");
		getSum(34, getSumOfAmount(34, 56,  null));
		

	}
	public static int getSumOfAmount(double num1, int num2, String str) {
		int sum = (int)(num1 + num2);
		System.out.println(sum);
		return sum;
	}
	
	public static void getSum(int num3, int sum) {
		int sumOfNum = num3 + sum;
		System.out.println(sumOfNum);
	}

}
