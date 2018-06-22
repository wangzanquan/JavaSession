package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		//Adding elements to HashMap
		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3, "IJ");
		
		//Print hashmap
		System.out.println("Before Sorting: ");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		//Passing One  Map into antoher Map
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry)iterator2.next();
			System.out.println(me2.getKey() + " : " + me2.getValue());
		}
	}

}
