package com.company.whileloop;

public class BreakStatement {

	public static void main(String[] args) {
		int num = 0;
		while (num <= 100) {
			System.out.println("Value of num" + num);
			if(num == 8) {
				break;
			}
			num++;
		}
		System.out.println("Out of While Loop");

	}

}
