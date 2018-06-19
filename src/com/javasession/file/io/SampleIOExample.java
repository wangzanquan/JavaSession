package com.javasession.file.io;

import java.io.Reader;
import java.io.StringReader;

public class SampleIOExample {

	public static void main(String[] args) {
		
		String str = "Java IO package session";
		
		Reader reader = new StringReader(str);
		
		try {
			
			for(int i = 0; i < str.length(); i++) {
				char c = (char)reader.read();
		
				System.out.print(c);
			}
		}catch (Exception e) {
			System.out.println("An exception has occured");
		}
		
		
		
	}

}
