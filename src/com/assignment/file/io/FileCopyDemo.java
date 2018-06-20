package com.assignment.file.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopyDemo {

	public static void main(String[] args) {
		
		/*
		 * Question:
		 * Why when the path ends with ".txt" it wont work?
		 */
		File originFile = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestFile2");
		
		//Creating destination file
		File destinationFile = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\Dest.txt");
		
		
		//Making copy
		try {
			Files.copy(originFile.toPath(), destinationFile.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
