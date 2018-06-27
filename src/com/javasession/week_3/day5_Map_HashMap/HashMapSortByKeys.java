package com.javasession.week_3.day5_Map_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByKeys {
	
	
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "A");
		hmap.put(2, "C");
		hmap.put(33, "E");
		hmap.put(9, "G");
		hmap.put(3,"I");
		
		System.out.println("Before Sorting:");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		//passing One Map into another Maps
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting: ");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}
		
	}
}
