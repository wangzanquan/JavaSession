package com.collection.List.ArrayList;

import java.util.ArrayList;

public class SubListOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Steve");
		al.add("Justin");
		al.add("John");
		al.add("Tony");
		al.add("Lily");
		al.add("Jim");
		
		/*
		 * al.sublist(first index, last index) it wont include the last index element
		 * 
		 */
		ArrayList<String> al2 = new ArrayList<>(al.subList(1, 3));
		System.out.println(al.subList(1, 3));
		
	}
}
