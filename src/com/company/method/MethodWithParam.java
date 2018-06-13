package com.company.method;

public class MethodWithParam {

	public static void main(String[] args) {
		getOne();
		getAll(4,4);
		
		int[] arr = {1,2,3,4,5};
		System.out.println(sumOfArray(arr, 5));
	}
	private static void getOne() {
		System.out.println("method test");
	}
	private static int getAll(int a, int b) {
		/*
		   It is better to write private.
		   If it is not static, you have to create a instance in main
		 */
		return a+b;
	}
	private static int sumOfArray(int[] array, int size) {
		int sum=0;
		for(int x: array) {
			sum += x;
		}
		return sum;
	}

}
