package com.javasession.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCard {
	public static void main(String[] args) {
		
		Object myObj = new Object();
		String str = "hey";
		myObj = str;
		System.out.println(myObj);
		
		Employee emp = new Employee();
		Accountant acct = new Accountant();
		emp = acct;
		
		//however you can't assign any collection class the same.
		ArrayList<Employee> arrList1 = new ArrayList<>();
		arrList1.add(new Employee());
		ArrayList<Employee> arrList2 = new ArrayList<>();
		arrList2.add(new Accountant());
		//Complie error
		//arrList1 = arrList2;
		
		
		//Wild card
		ArrayList<?> arr = new ArrayList<>();
		arr = arrList1;
		arr = arrList2;

		//Method 2 - any employee or it's child class, this is Upper bound
		ArrayList<? extends Employee> arrList4 = new ArrayList<>();
		arrList4 = arrList2;
		
		//Lower bound with wired bound
		ArrayList<? super Employee> arrList5 = new ArrayList<>();
		ArrayList<Object> arrObj = new ArrayList<>();
		arrList5 = arrObj;
		
	}
	
	public static void makeEmployeeWork(List<?extends Employee> emp) {
		for(Employee em : emp) {
			System.out.println(em);
		}
	}
	
}

class Employee{
	public void work() {
		System.out.println("Employee is working ");
	}
}
class Accountant extends Employee{
	public void work() {
		System.out.println("Accountant is working");
	}
}

