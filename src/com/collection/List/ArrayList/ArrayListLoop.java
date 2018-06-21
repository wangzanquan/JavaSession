package com.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLoop {

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<>();
		System.out.println(st.size());
		
		st.add(56);
		st.add(42);
		st.add(46);
		st.add(23);
		st.add(04);
		st.add(21);
		
		//For loop
		for(int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		//For each loop
		for(Integer num: st) {
			System.out.println("For Each Loop: " + num);
		}
		//While loop
		int count = 0;
		while(st.size() > count) {
			System.out.println(st.get(count));
			count++;
		}
		//Iterator
		System.out.println("***************************");
		Iterator it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
