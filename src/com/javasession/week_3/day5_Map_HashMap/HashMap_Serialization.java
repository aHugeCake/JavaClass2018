package com.javasession.week_3.day5_Map_HashMap;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class HashMap_Serialization {

	//Serialization		--> convert to byte-code (binary)
	//DeSerialization	--> convert from  binary to original object form
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		//Adding elements to HashMap
		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3,"IJ");
		
		//Object to File Object Stream
		//HashMap is an object type
		try {
			FileOutputStream fos = new FileOutputStream("src/attaches/hashmap.ser");	// .ser can be changed to any other extend
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			System.out.printf("Serialized HashMap data is saved in hashmap.ser");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
}
