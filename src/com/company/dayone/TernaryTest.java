package com.company.dayone;
import java.util.Scanner;
public class TernaryTest {
	/*
	 * Create class
	 * three value number values as input
	 * print the largest value
	 */

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int large = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number 1");
		num1 = scan.nextInt();
		
		System.out.println("Number 2");
		num2 = scan.nextInt();
		
		System.out.println("Number 3");
		num3 = scan.nextInt();
		
		scan.close();
		
		large = (num1>num2) ? num1 : num2;
		large = (large>num3) ? large : num3;
		
		System.out.println("The largest number is " +large);

	}

}
