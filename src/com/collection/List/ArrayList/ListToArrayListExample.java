package com.collection.List.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListToArrayListExample {
	//How to add one list to another list
	
	public static void main(String[] args) {
		List<String> a1 = new Vector<>();
		a1.add("text 1");
		a1.add("text 2");
		a1.add("text 3");
		
		System.out.println(a1);
		
		List<String> a2 = new Vector<>();
		a2.add("text 4");
		a2.addAll(a1);
		
		System.out.println(a2);
		
		//Sorting
		//Collections.sort(a2);
		
		//ReverseOrder Sorting
		Collections.sort(a2, Collections.reverseOrder());
		System.out.println(a2);
		
	}
}
