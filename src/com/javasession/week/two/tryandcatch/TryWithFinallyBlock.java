package com.javasession.week.two.tryandcatch;

import java.util.Scanner;

public class TryWithFinallyBlock {

	public static void main(String[] args) {
		
		try {
			int numberj = 234/1;
		}catch (ArithmeticException e) {
			System.out.println("number can not be devided by zero");
		}
		finally{
			System.out.println("End of block");
		}
		
		tryFinally();
		
	}
	
	public static void tryFinally() {
		Scanner scan = new Scanner(System.in);
		try {
			int num = scan.nextInt();
		}finally {
			scan.close();
		}
	}

}
