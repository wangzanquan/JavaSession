package com.collection.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeSerializationOfHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = null;
		try {
			FileInputStream fis = new FileInputStream("hashmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			map = (HashMap)ois.readObject();
			ois.close();
			fis.close();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}
		
		System.out.println("Deserialized HashMap .. ");
		//Desplay content usting Iterator
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key: " + mentry.getKey() + " & Value: " + mentry.getValue());
			//System.out.println(mentry.getValue());
			
		}
		
		
	}
}
