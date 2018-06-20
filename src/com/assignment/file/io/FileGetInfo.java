package com.assignment.file.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileGetInfo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestingTextFile");
		
		//Why the following lines not in the try-catch block
		System.out.println("File Size: " + file.length());
		System.out.println("File Name: " + file.getName());
				
				
		try {
			System.out.printf(file.getName() + "\nFile Patch: " + file.getCanonicalPath());
			
		} catch (Exception e) {
			System.out.println("Program failed"); 
		}
		
		
		
		
	}//end main

}
