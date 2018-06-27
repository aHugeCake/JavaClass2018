package com.javasession.week_3.day5_Map_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsWithLoops {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		//Adding elements to HashMap
		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3,"IJ");
		
		//For Loop
		System.out.println("For loop: ");
		for(Map.Entry me: hmap.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}
		
		//While Loop & Iterator
		//Iterator can only understand List, but not Map
		System.out.println("While Loop: ");;
		Iterator iterator = hmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry me2 = (Map.Entry)iterator.next();
			System.out.println("Key: " + me2.getKey() + " & Value: " + me2.getValue());
		}
		
	}
}
