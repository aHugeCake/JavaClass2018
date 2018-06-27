package com.javasession.week_3.day4_Collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class AddListToVectorSample {
	/*
	 * Vector is very security, but very heavy
	 * Advantage:
	 * 		make the process safe --> threads
	 */

	//How to add One list to another list
	
	public static void main(String[] args) {
		List<String> a1 = new Vector<>();
		a1.add("text 1");
		a1.add("text 2");
		a1.add("text 3");
		
		System.out.println(a1);
		
		List<String> a2 = new Vector<>();
		a2.add("text 4");
		a2.addAll(a1);
		
		//Any collection can use this
		//java.util.Collections.sort(a2);
		Collections.sort(a2);		//ascending, index changes
		Collections.sort(a2, Collections.reverseOrder()); 	//descending
		System.out.println(a2);
	}
}
