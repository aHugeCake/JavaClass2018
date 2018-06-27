package com.javasession.week_3.day5_Map_HashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_DeSerialization {

	//Serialization		--> convert to byte-code (binary)
	//DeSerialization	--> convert from  binary to original object form
	public static void main(String[] args) {		
		HashMap<Integer, String> map = null;
		try {
			String path = "src/attaches/hashmap.ser";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			map = (HashMap) ois.readObject();
			
			fis.close();
			ois.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}
		
		System.out.println("Deserialized HashMap..");
		
		//Display content using Iterator		
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key: " + mentry.getKey() + " & Value: ");
			System.out.println(mentry.getValue());
		}
		
		//The HashMap deserialized changes its order since map doesn't preserve order
	}
}
