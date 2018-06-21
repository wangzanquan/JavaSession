package com.assignment.file.io;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class FileWriteOrAppendDemo {
	static void append(String s, File f) throws IOException{
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
	}
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\Append.txt");
		if(!f.exists()) {
			f.createNewFile();
		}else {
			append("Origin Text", f);
		}
		
		
		
	}

}
