package com.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {
	public static void main(String[] args) {
		
		/*
		 * Collection class does NOT support primitive data type. (Wapper class)
		 * 
		 * ex. List<Integer> vname = ArrayList<>();
		 * 
		 *  		 List<String> vname = ArrayList<>();
		 *  Same as: List<String> vname = LinkedList<>();
		 */
		
		List<String> strArrayList = new ArrayList<>();
		System.out.println(strArrayList.size());
		
		//Add elements
		strArrayList.add("AA");
		strArrayList.add("BB");
		strArrayList.add("CC");
		System.out.println(strArrayList.size());
		System.out.println(strArrayList);
		
		//Add elements to index
		//st.add(index, content)
		strArrayList.add(1, "Test");
		System.out.println("Current List index: " + strArrayList);
		
		/*
		 * Remove:
		 * 		st.remove(index)
		 * 		st.remove(content)
		 */
		strArrayList.remove(0);
		strArrayList.remove("Test");
		System.out.println(strArrayList);
		
		//Replace some element
		//strArrayList.set(index, content)
		strArrayList.set(0, "LL");
		System.out.println(strArrayList);
		
	}
}
