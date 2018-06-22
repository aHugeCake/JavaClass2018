package com.javasession.week_3.day2_File_IO_Reader_Writer_File;

import java.io.Reader;
import java.io.StringReader;

public class ReaderSample {
	//Terminal(compile): javac filename.java
	//Terminal(run): java filename
	public static void main(String[] args) {
		
		String str = "Java IO package session";
		
		Reader reader = new StringReader(str);
		
		try {
			for(int i=0; i<str.length(); i++) {
				//System.out.print(str.charAt(i));
				//System.out.println(Integer.toBinaryString(reader.read()));
				char c = (char)reader.read();
				
				/*
				 * System.lineSeparator. This program uses System.lineSeparator. On a Windows computer this is equal to \r\n. On a Mac (or Linux) system it equals just "\n."
				 */
				System.out.println(c);
				Thread.sleep(100);
				System.out.print("\b\b\b\b");
					
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("An exception has occurred");
		}
	}
	
	/*
	 * JMS (Java Message Service)
	 * 		a Java message-oriented middleware application programming interface for sending messages between two or more clients
	 * RSS (Rich Site Summary, originally Really Simple Syndication)
	 * 		a type of web feed which allows users to access updates to online content in a standardized, computer-readable format
	 * These two design patterns have similar code field and different source
	 */
	
}
