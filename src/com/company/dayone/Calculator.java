package com.company.dayone;
import java.util.Scanner;;

public class Calculator {
	static int result;
	public static void main(String[] args) {
		int x;
		int y;
		char oper;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		x = scan.nextInt();
		
		System.out.println("Enter the operation mark ( +, -, *, /)");
		oper = scan.next().charAt(0);
		
		System.out.println("Enter the second number");
		y = scan.nextInt();
		
		switch(oper) {
			case('+'):
				result = x + y;
				break;
			case('-'):
				result = x - y;
				break;
			case('*'):
				result = x * y;
				break;
			case('/'):
				result = x / y;
				break;
		}
		
		System.out.println("The result is: " + result);
	}
}
