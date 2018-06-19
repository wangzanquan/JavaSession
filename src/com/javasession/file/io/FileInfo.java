package com.javasession.file.io;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File file = new File("/Users/Yang/Documents/JavaSession/JavaSession/src/com/javasession/file/io/Input.txt");
		
		//File newFile = new File();
		
		System.out.println("This is the file size: " + file.length());
		System.out.println("This is the file name: " + file.getName());
		
		try {
			//This is print FILE printf
			System.out.printf(file.getName() + " File Path " + file.getCanonicalPath());
			
		} catch (Exception e) {
			System.out.println("failed!");
		}
		
		
	}
	
	
}
