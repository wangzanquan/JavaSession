package com.javasession.file.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;

public class BinaryandCharWriter {
	private String firstName;
	private String lastName;
	private int empId;
	private boolean isActive;
	
	public BinaryandCharWriter(String firstName, String lastName, int empId, boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.isActive = isActive;
	}
	
	public void writeBinary(OutputStream out) throws IOException {
		DataOutputStream dataOut = new DataOutputStream(out);
		dataOut.writeChars(firstName);
		dataOut.writeChars(lastName);
		dataOut.writeInt(empId);
		dataOut.writeBoolean(isActive);
		
	}
	
	public void writeText(Writer out) {
		PrintWriter printOut = new PrintWriter(out);
		printOut.println(firstName);
		printOut.println(lastName);
		printOut.println(empId);
		printOut.println(isActive);
	}
	
	//main method
	public static void main(String[] args) {
		BinaryandCharWriter emp1 = new BinaryandCharWriter("Mike", "Trump", 49, true);
		BinaryandCharWriter emp2 = new BinaryandCharWriter("Tony", "Wang", 42, true);
		BinaryandCharWriter emp3 = new BinaryandCharWriter("Lily", "Li", 46, false);
		
		try {
			FileOutputStream data = new FileOutputStream("/Users/Yang/Documents/JavaSession/JavaSession/src/com/javasession/file/io/SampleEmpBinary.txt");//creating file
			emp1.writeBinary(data);
			emp2.writeBinary(data);
			emp3.writeBinary(data);
			data.close();
			
			FileWriter txt = new FileWriter("/Users/Yang/Documents/JavaSession/JavaSession/src/com/javasession/file/io/SampleEmpText.txt");
			emp1.writeText(txt);
			emp2.writeText(txt);
			emp3.writeText(txt);
			txt.close();
			
			System.out.println("Requested Text has been printed to the file");
			
			
			
		} catch (IOException e) {
			System.out.println("Some error occured");
		}
		
		
		
		
		
	}
	
	
	
}//end class
