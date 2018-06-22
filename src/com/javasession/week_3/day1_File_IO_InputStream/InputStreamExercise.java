package com.javasession.week_3.day1_File_IO_InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExercise {
	
	public static void main(String[] args) {
		InputStream obj = null;
		int i;
		char c;		
		
		try {
			obj = new FileInputStream("src/com/javasession/week_3/day1_file_io/demo.txt");	
			
			while((i = obj.read())!=-1) {
				c = (char)i;   
				System.out.print(c);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error while reading the file");
		}
		//The finally block always executes when the try block exits.
		finally {
			if(obj != null) {
				try {
					obj.close();
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("Error while closing the file");
				}
			}
		}
	}

	
}
