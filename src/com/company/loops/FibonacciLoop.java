package com.company.loops;
import java.util.Scanner;
public class FibonacciLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the counter number");
		int count = scan.nextInt();
		
		int[] array = new int[count];
		
		System.out.println("Enter the first number.");
		array[0] = scan.nextInt();
		
		System.out.println("Enter the first number.");
		array[1] = scan.nextInt();
		
		for(int i = 2; i < array.length; i++) {
			array[i] = array[i-2] + array[i-1];
		}
		for(int num: array) {
			System.out.println(num);
		}
		
		

	}

}
