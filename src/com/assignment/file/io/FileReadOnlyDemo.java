package com.assignment.file.io;

import java.io.File;
import java.io.IOException;

public class FileReadOnlyDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestReadOnly");
		
		if(f.exists()==true) {
			f.setReadOnly();
			System.out.println("The file: " + f.getName() + " has been set to READ-ONLY file.");
			
		}else {
			f.createNewFile();
			System.out.println("The file: "+ f.getName()+ " was not found, so the system has already created that.");
		}
		
		
		
	}

}
