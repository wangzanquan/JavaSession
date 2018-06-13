package com.company.dayone;

public class DayTwoDataType {

	public static void main(String[] args) {
		//Java Operators
				/*
				 * 1.Basic arithmetic
				 * 2.Assignment
				 * 3.Auto-increment
				 * 4.logical
				 * 5.Comparison
				 * 6.ternary
				 */
				
				
				//1.Basic Arithmetic
				// +, -, *, /, %
				
				//2.Assignment
				// =, +=, -=, /=, and %=
				
				//3.Auto Increment and Auto Decrement
				//--, ++
				int number = 1;
				System.out.println("logical" + number++); //*****The output is 1!***** number++  assign first, then add 1
				
				//4.Logical Operators
				//&&, ||, !
				
				//5.Comparison
				// ==, !=, >, <, >=, <=
				int num1 = 10;
				int num2 = 50;
				if(num1 == num2) {
					System.out.println("Num1 and Num2 are same");
				}else {
					System.out.println("Num1 and Num2 are not the same");
				}
				if(num1>num2) {
					System.out.println("Num1 is greatter than num2");
				}else {
					System.out.println("Num1 is not greatter than num2");
				}
				if(num1 < num2) {
					System.out.println("Num1 is smaller than num2");
				}else {
					System.out.println("Num1 is not smaller than num2");
				}
				if(num1 != num2) {
					System.out.println("Num1 equals to num2");
				}else {
					System.out.println("Num1 does not equal to num2");
				}
				if(num1<=num2) {
					System.out.println("Num1 is not greatter than num2");
				}else {
					System.out.println("Num1 is greatter than num2");
				}
				if(num1>=num2) {
					System.out.println("Num2 is not greatter than num1");
				}else {
					System.out.println("Num2 is smaller than num1");
				}
				
				//6.Ternary
				//var num = (expression) ? value if true: value if false;
				
				int num3;
				int num4;
				
				num3 = 25;
				num4 = (num1==10) ? 100:200;
				System.out.println(num4);
				
				

	}

}
