package com.assignment.List;

import java.util.HashSet;
import java.util.Set;

public class CallEmployeeList extends Employee{
	
	public CallEmployeeList(String name, int age, String gender, String address, double salary) {
		super(name, age, gender, address, salary);
	}
	
	
	public static void main(String[] args) {
		testList();
		
		
	}
	public static void testList() {
		Set<String> s = new HashSet<String>();
	}

}
