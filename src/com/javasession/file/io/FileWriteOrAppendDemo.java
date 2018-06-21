package com.javasession.file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOrAppendDemo {

	static void write(String s, File f) throws IOException {
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		
		/*
		 * Question:
		 * Why without .clos() the file won't write
		 */
		fw.close();
	}
	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\myfile.txt");
			if(f.exists()) {
				write("Add this to before.", f);
			}else {
				f.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("Faild");
		}
		

	}

}
