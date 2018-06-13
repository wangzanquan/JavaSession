package com.company.loops;

public class ForLoopForArray {

	public static void main(String[] args) {
		
		int arr[] = {2,11,45,9};
		
		//For loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
		//For each loop (Enhanced for loop)
		for(int num: arr) {
			System.out.println(num);
		}

	}

}
