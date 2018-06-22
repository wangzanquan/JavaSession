package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class SampleMap {

	public static void main(String[] args) {

		Map<String, String> lng = new HashMap<>();
		
		//Input value
		lng.put("Java", "OOP Language");
		lng.put("C++", "Good Scripting Language");
		lng.put("JS", "Best for Web Development");
		
		System.out.println(lng.get("Java"));
		
		//Changing value
		lng.put("Java", "Supported by Oracle");
		System.out.println(lng.get("Java"));
		
		//For particular key there is always on value in map
		//Also you can check if the value is there or not
		if(lng.containsKey("SQL")) {
			System.out.println("SQL is already there");
		}else {
			lng.put("SQL", "It's language for database");
		}
		
		//search value
		System.out.println("Checking the value only: " + lng.containsValue("Good Scripting Language"));
		
		//check key
		System.out.println(lng.containsKey("SQL"));
		
		System.out.println(lng.get("SQL"));
		
		System.out.println("===============================================");
		
		//HashMap will not preserve insertion order
		for(String key: lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		System.out.println("===============================================");
		
		//remove. It will remove the entire block.
		System.out.println(lng.remove("SQL"));
		
		//Remove with Key and Value both matched
		if(lng.remove("Java", "OOP Language")){
			System.out.println("removed java lang");
		}else {
			System.out.println("Since key and value does not match, it will not delete the object");
		}
		System.out.println("===============================================");
		
		//print again
		for(String key: lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		
		System.out.println("===============================================");
		//Replacing
		lng.replace("Java", "It's Upoorts Lamda expression");
		lng.replace("Scala", "It's big data langurage");//this will add key element since key does not exist.
		
		for(String key: lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		
		System.out.println("===============================================");
		//check if map is empty
		System.out.println("Check to see if map is empty or not: = " + lng.isEmpty());
		//Remove all
		System.out.println("Remove all");
		lng.clear();
		System.out.println("Check to see if map is empty or not: = " + lng.isEmpty());
		
		
		
		
		
		
		
	}

}
