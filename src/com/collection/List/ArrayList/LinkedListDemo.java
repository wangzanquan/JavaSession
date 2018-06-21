package com.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		linkedList();
	}
	public static void linkedList() {
		LinkedList<String> link = new LinkedList<>();
		
		link.add("DC");
		link.add("NY");
		link.add("BOSTON");
		link.add("BALTIMORE");
		System.out.println("Full city list: " + link);
		
		link.addFirst("Chicago");
		link.addLast("Houston");
		
		System.out.println("After adding city: " + link);
		
		Object firstVar = link.get(0);
		Object thirdVar = link.get(2);
		System.out.println(firstVar + " " + thirdVar);
		
		link.set(0, "SFO");
		link.set(2, "KENSAS");
		System.out.println("After Set: " + link);
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Phoenix");
		arrList.add("San Antonio");
		arrList.add("Dallas");
		
		link.addAll(arrList);
		System.out.println("After adding ArrayList: " + link);
		
		System.out.println("Index for NewYork City: " + link.indexOf("New York"));
		
		link.clear();
		System.out.println("Clear all list: " + link);
		
		
	}
	
}
