package com.assignment.file.io;

import java.io.File;
import java.io.IOException;

public class FileDeleteDemo {

	public static void main(String[] args) throws IOException{

		File f = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\DeleteFile");
		
		if(f.exists()) {
			System.out.println("The file \"" + f.getName() + "\" is exsited, and it is beening deleting.");
			f.delete();
		}else {
			System.out.println("The file is not existed.");
			f.createNewFile();
			System.out.println("The file \"" + f.getName() + "\" has been created.");
		}
		
	}

}
