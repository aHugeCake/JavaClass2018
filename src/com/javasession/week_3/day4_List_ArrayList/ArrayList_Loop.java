package com.javasession.week_3.day4_List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Loop {

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<>();
		System.out.println(st.size());
		st.add(56);
		st.add(45);
		st.add(67);
		st.add(56);
		st.add(45);
		st.add(67);
		st.add(56);
		st.add(45);
		st.add(67);
				
		//For Loop
		for(int i=0; i<st.size(); i++) {
			System.out.println("For loop: " +st.get(i));
		}
		
		//For Each Loop
		for(Integer num: st) {
			System.out.println("For each loop: " + num);
		}
		
		//While Loop
		int count = 0;
		while(st.size() > count) {
			System.out.println("While Loop: " + st.get(count));
			count++;
		}
		
		//Iterator
		//One of the classes go through the collection one by one
		Iterator it = st.iterator();
		while(it.hasNext()) {
//			if(st.indexOf(45) == 1)
//				break;
			if(it.next().equals(67))
				break;
			System.out.println("Iterator: " + it.next());
		}
		
		
		System.out.println(st);
		st.remove(0);
//		st.remove(95);	//In this list, we cannot remove particular element because java will regard as index
//		st.get(95);		//The same condition with remove
		
		//return the index of an element
		System.out.println(st.indexOf(67));
		
		
	}
}
