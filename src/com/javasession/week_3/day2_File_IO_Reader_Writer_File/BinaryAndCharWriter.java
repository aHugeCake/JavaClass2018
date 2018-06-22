package com.javasession.week_3.day2_File_IO_Reader_Writer_File;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class BinaryAndCharWriter {
	
	/*
	 * Writer:
	 * -->	4 val --> Data
	 * 	   +1 constructor		//might need creating an object of this class
	 * 	   +2 ByteWriter && TextWriter
	 * 	   +1 Main Method
	 * 	   		|--- File Object (Byte)
	 * 			|--- File Object (Text)
	 * Manually (not code):
	 * --> Verify File Created
	 * --> Context(text) is there	//whether there are wordis in the file
	 */
	private String firstName;
	private String lastName;
	private int empId;
	private boolean isActive;
	
	
	
	public BinaryAndCharWriter(String firstName, String lastName, int empId, boolean isActive) {
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
	
	public void writeText(Writer out) {		//Writer doesn't enforce an exception
		PrintWriter printOut = new PrintWriter(out);
		printOut.println(firstName);
		printOut.println(lastName);
		printOut.println(empId);
		printOut.println(isActive);
		
	}



	public static void main(String[] args) {
		BinaryAndCharWriter emp1 = new BinaryAndCharWriter("Mike","Smith",34523,true);
		BinaryAndCharWriter emp2 = new BinaryAndCharWriter("Josh","Smith",23423,true);
		BinaryAndCharWriter emp3 = new BinaryAndCharWriter("Paul","Smith",68768,true);
		
		try {
			
			FileOutputStream dat = new FileOutputStream("BinaryDemo.txt");	//From the root
			emp1.writeBinary(dat);
			emp2.writeBinary(dat);
			emp3.writeBinary(dat);
			dat.close();
			
			FileWriter txt = new FileWriter("TextDemo.txt");
			emp1.writeText(txt);
			emp2.writeText(txt);
			emp3.writeText(txt);
			txt.close();
			
			System.out.println("Requested Text has been printed to the file");
			//The project name --> right click --> refresh, then we can see the created new files
		}catch(Exception e) {
			System.out.println("An exception has occurred!");
		}
	}
}
