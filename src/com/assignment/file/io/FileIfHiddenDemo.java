package com.assignment.file.io;

import java.io.File;
import java.io.IOException;

public class FileIfHiddenDemo {

	public static void main(String[] args) throws IOException{
		
		File f = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestingTextFile");
		
		if(f.isHidden()) {
			System.out.println("The file: " + f.getName() + ", is hidden.");
		}else {
			System.out.println("The file: " + f.getName() + ", is NOT hidden.");
		}
		
	}

}
