package com.javasession.week_3.day5_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {

	/*
	 * Map interface (default space --> 16):
	 * 		HashMap
	 * 		TreeMap
	 * 		HashTable
	 * *Note: TreeMap stores ascending order of key
	 * 
	 * Initialize a map:
	 * 		Map<...> mp = new HashMap<...>();
	 * 			^ ^
	 * 			| |
	 * 		  key value
	 * The argument is wrapper class because map is a reference
	 * eg. String, Integer(int) ... POJO(my datatype)
	 * 
	 *  Every map will have 16 blocks/nodes 
	 *  Map has LinkedList inside
	 *  		---	  ------	  -----		  ---
	 *  	    | |   |    |  |   | ----> |  |
	 *  		---   ------  -----		  ---
	 *  
	 *  			  |----------- = LinkedList
	 *  			  |
	 *  		-------------
	 *  		|	Node 0	|	--> stores: hashcode number
	 *  		-------------				key
	 *  		|	Node 1	|				value
	 *  		-------------				Next --> the value of next node
	 *    	|	Node 2	|		*Note: hash-code: a number in the memory of this number in JVM
	 *  		-------------				
	 *  		|	Node 3	|					
	 *  		-------------				eg. Map<Int,String> --> 22, "John"	
	 *  		|	Node 4	|					hashcode = 22000 (hash-key: hash-code of key)
	 *  		-------------					key = 22
	 *  		|	Node 5	|					value = "John"
	 *      -------------					next
	 *    	|	Node 6	|
	 *  		-------------
	 *    	|	Node 7	|
	 *  		-------------	  16 nodes will not increase
	 *    	|	Node 8	|	  add a new node in same node:
	 *  		-------------	  ----------		  ---------- 	    ----------
	 *    	|	Node 9	| --> |New Node|	 ---> |		   |  --->  |		 |			
	 *  		-------------	  ----------      ----------        ----------
	 *    	|	Node 10	|	  store new value
	 *  		-------------		|
	 *    	|	Node 11	|		|
	 *  		-------------		|---> every index position is a list (LinkedList)
	 *    	|	Node 12	|
	 *  		-------------		In List, index is unique (primary key)
	 *    	|	Node 13	|		In Map, index is not unique because map itself has key (unique)
	 *  		-------------
	 *    	|	Node 14	|		1 byte for null <-- key
	 *  		-------------					|--> only one null value in map
	 *    	|	Node 15	|
	 *  		-------------   
	 */
	
	
	
	/*
	 * 		client					server
	 * 		------		------		------
	 * 	   |	  UI	  |---->| APP |---->| DB  |
	 * 		------		------		------
	 * 	  such as web	   |			   |-- 10,000 records    
	 * 					   |-> JVM	   |-- 500 records available
	 * 							^				 | read
	 * 							|----------------| 
	 * 								store in JVM (because cannot send the records table to UI directly) 
	 * 		AngularJS:	emphasis on front-end
	 * 		NodeJS:		emphasis on backstage
	 */
	public static void main(String[] args) {
		/*
		 * HashMap	--> not thread safe
		 * TreeMap	--> not thread safe with order of key (ACS)
		 * HashTable	--> thread safe (deadlock), but consumes more memory
		 */
		Map<String, String> lng = new HashMap<>();
		
		lng.put("Java", "OOP Language");
		lng.put("C++", "Good Scripting Language");
		lng.put("JS", "Best for Web Developer");
		
		System.out.println(lng);
		
		System.out.println(lng.get("Java"));
		
		//Overriding
		lng.put("Java", "Supported by Oracle");
		System.out.println(lng.get("Java"));
		
		//For particular key there is always one value in map
		//Also you can check if the value is there or not
		if(lng.containsKey("SQL")) {
			System.out.println("SQL is already there");
		}else {
			lng.put("SQL","It's language for database");
		}
		
		System.out.println("Checking the value only " + lng.containsValue("Good Scripting Language"));
		
		System.out.println(lng.containsKey("SQL"));	//it's return true
		System.out.println(lng.get("SQL"));
		
		System.out.println("==============================");
		//HashMap will not preserve insertion order
		
		for(String key:lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		
		System.out.println("=============================");
		
		System.out.println(lng.remove("SQL"));
		
		//Or you can only remove is Key and value both match
		if(lng.remove("Java", "OOP Language")) {
			System.out.println("removed java lang");
		}else {
			System.out.println("Since key and Value does not match it will not delete the object");
		}
		
		System.out.println("=============================");
		for(String key: lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		
		lng.put("SQL", "It's database query language");
		lng.put("SQL", "It's also supports open source database");
		//it will only insert last key as Key has to be unique in hash map.
		
		System.out.println("=============Adding two SQL Keys and Values===========");
		for(String key: lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		
		System.out.println("===== About replacing Key and Values=========");
		lng.replace("Java", "It's suports Lamda expression");
		lng.replace("Scala", "it's big data language");	// this will not add key element since key does not exist
														// Only put can add new element
		
		for(String key: lng.keySet()) {
			System.out.println(key + " : " + lng.get(key));
		}
		
		
		
		/*
		 * Difference between empty and null
		 * 
		 * empty:
		 * String s1 = ""; means that the empty String is assigned to s1. In this case
		 * s1.length() is the same as "".length(), which will yield 0 as expected.
		 * 
		 * null:
		 * String s2 = null; means that (null) or "no value at all" is assigned to s2. So this one
		 * s2.length() is the same as null.length(), which will yield a NullPointerException as you can't call methods on null variables (pointers, sort of) in Java.
		 * 
		 * *Note: null is a value, but empty isn't
		 */
		System.out.println("============================");
		System.out.println("check to see if map is emplty or not: = " + lng.isEmpty());
		System.out.println("Remove all");
		lng.clear();
		System.out.println("check to see if map is empty or not: = " + lng.isEmpty());
		
	}
}
