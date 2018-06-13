package com.company.controlflow;
import java.util.Scanner;
public class ifElseTestOne {
	/*
    If num is odd, print Weird
	If num is even and in the inclusive range of 2  to 5  , print Not Weird
	If num is even and in the inclusive range of  6 to 20  , print Weird
	If num is even and greater than 20 , print Not Weird
	Validation: user input range 1 to 100;

	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2 != 0) {
			System.out.println("Weird");
		}else {
			if(num >= 2 && num <= 5) {
				System.out.println("Weird");
			}else if(num >= 6 && num <= 20) {
				System.out.println("Weird");
			}else if(num > 20) {
				System.out.println("Not Weird");
			}
		}
		
		
	}
}
