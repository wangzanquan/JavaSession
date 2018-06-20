package com.javasession.file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTextReadWrite {
	
	static char[] chars;

	static void readFileArray(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileReader fis = null;
		
		try {
			fis = new FileReader(f);
			int intLength = (int)length;
			
			chars = new char[intLength];
			fis.read(chars);
			
		} catch (IOException e) {
			System.out.println("File is not found.");
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				System.out.println("File pointer is still open.");
			}
		}
	}
	
	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		FileWriter fos = null;
		
		try {
			fos = new FileWriter(f);
			fos.write(chars);
			
		} catch (IOException e) {
			System.err.println(e);
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\TextReadWrite.txt";
		readFileArray(fileName);
		
		//Write to another file
		String fileName2 = "C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\javasession\\file\\io\\NewTextReadWrite.txt";
		writeArrayToFile(fileName2);
		
	}

}
