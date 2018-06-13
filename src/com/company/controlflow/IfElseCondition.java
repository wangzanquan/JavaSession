package com.company.controlflow;
import java.util.Scanner;
public class IfElseCondition {

	/*
	 	a) if statement
	 	b) nested if statement 
	 	c) if-else statement
	 	d) if-elseif statement
	 	
	 	a. if statement
	 		if(condition){
	 			statement(s);
	 		}
	 	b. nested if statement
	 	 	if(condition){
	 	 		if(condition){
	 				statement(s);
	 			}
	 		}
	 	c. if else statement
	 		if(condition){
	 			statement(s);
	 		}else{
	 			statement(s);
	 		}
	 	d. if-else if statement
	 		if(condition){
	 			statement(s);
	 		}else if(condition){
	 			statement(s);
	 		}else{
	 			statement(s);
	 		}
	 */
	
	public static void main(String[] args) {
		//if statement
		int num = 70;
		if(num < 100) {
			System.out.print("Number is less than 100");
			if(num>50) {
				System.out.print("Number is greater than 100");
			}
		}
		
		//given number check it positive or negative or zero
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number");
		int num1 = scan.nextInt();
		
		if(num1 > 0) {
			System.out.print("positive");
		}else if(num1 == 0) {
			System.out.print("zero");
		}else {
			System.out.print("negative");
		}
		if(num1 % 2 == 0) {
			System.out.print(" and it's a even number");
		}else {
			System.out.print(" and it's a odd number");
		}
		
		
		
		
		
	}
	
}
