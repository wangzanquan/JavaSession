package com.company.dayone;

import java.util.Scanner;

public class DayOne {
	
	static String str = "Test";
	static int num1 = 12;
	int num2 = 24;
	
	public void getAll() {
		System.out.println(num2);
	}
	
	public static void main(String[] args) {
		
		
		//Data types
		/*
		 * 1.Primitive data type--only single value; they have no special capabilities
		 * 	boolean
		 * 	byte
		 *  char
		 *  short
		 *  int
		 *  long
		 *  float
		 *  double
		 *  
		 * 2.Reference data type
		 * 		String -- String is a class
		 * 		Object
		 */
		byte num = 11;
		short num1 = 23455;
		
		System.out.println(num);
		System.out.println("this is short: " + num1);
		
		char ch = 'A';
		System.out.print(ch);
		
		float num3 = 12.98f; //f means just mention about the data type, and it is necessary 
		double num4 = 1233.456d;//d is not required
		
		/*
		 * Can you code that will have two number variable
		 * and print the sum of it
		 */
		
		float a = 12.111f;
		double b = 11.222;
		
		int sum = (int) ((int)a + b);
		System.out.println("The sum is: "+sum);
		
		//Using scanner to do it
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the fist");
		int d = scan.nextInt();
		System.out.println("enter the second");
		float e = scan.nextFloat();
		float sum2 = d+e;
		System.out.println(d+e);
		
		
		
		
		
		
		
		
		/*****************************************************************/
		
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String str = scan.nextLine();
		scan.close();
		System.out.println("The name that you entered: " + str);
		
		
		System.out.println(str);
		System.out.println(num1);
		
		/*
		 * Local Variable
		 * Static Variable
		 * Instance Variable
		 */
		
		//Static variable
		/*
		 * Static means it does't need to be initialize
		 * The static method will only understand the static variable, this is why the static variable is out side static method
		 * 
		 */
		
	}
}
