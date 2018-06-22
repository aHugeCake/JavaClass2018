package com.javasession.week_3.day1_File_IO_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

//The Java.io.InputStream class is the superclass of all classes representing an input stream of bytes
//Applications that need to define a subclass of InputStream must always provide a method that returns the next byte of Input
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] args) {
		InputStream is = null;
		int val;
		char c;;
		//byte will convert values in to byte data type
		
		try {
			//Create a file in Eclipse --> package --> right click --> New --> Other --> General --> File --> Next --> input file name
			
			//new input stream created
			//FileInputStream focus on format
			is = new FileInputStream("src/com/javasession/week_3/day1_file_io/demo.txt");	//Windows should use '//'
			//is = new FileInputStream("demo.txt");
			System.out.println("Characters printed:");
			
			//reads till the end of the stream
			//Java returns -1 when it's the end of a stream(document/file/anything)
			//InputStream class has read and write methods
			while ((val=is.read())!= -1) {
				//converts integer to character
				c = (char) val;  //one val is 1 byte(8-bit), represents a number or a letter
								 //Unicode
				//prints character
				System.out.print(c);
			}
		}catch(IOException e) {
			//if any I/O error occurs
			e.printStackTrace();
			System.out.println("An error occured");
		}
		finally {
			//releases system resources associated with this stream
			if(is != null) {
				try {
					//Close the stream, close the connection
					is.close();
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("An error occured while closing the stream");
				}
			}
		}
	}
}
