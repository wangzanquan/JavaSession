package com.javasession.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class PersonDemo {
	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("Tony", "Wang", 20));
		al.add(new Person("Lily", "Li", 18));
		al.add(new Person("Frank", "Niller", 50));
		
		Collections.sort(al);
		for(Person str : al) {
			System.out.println(str.getFname() + " " + str.getLname() + " " + str.getAge());
		}
		
		//print last name with N
		System.out.println("***********Last Name Starts With N************");
		for(Person p: al) {
			if(p.getLname().startsWith("N")) {
				System.out.println(p);
			}
		}
		
		
	}
	
	interface SortName{
		void sorting(ArrayList<Person> al);
	}
}
