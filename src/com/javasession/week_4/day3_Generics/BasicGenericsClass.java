package com.javasession.week_4.day3_Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BasicGenericsClass {
	//Generic: user-defined value
	//When you want to use a value, just pass the correct datatype
	//Most of java classes are generic classes
	//eg. ArrayList<E>-->(declaration in the library)
	
	// We can not determine what datatype the user will input
	public static void main(String[] args) {
//		//An ArrayList with elements with different datatype
//		ArrayList<Object> al = new ArrayList<>();
//		al.add("Hello");
//		al.add(78);
//		al.add(true);
//		System.out.println(al);
//		
//		String str = (String)al.get(0);
//		String str1 = (String)al.get(1);	 //Because this value is not a string, it will throw an error while running
		
		callToProductClass();
		getUnionOfSetValues();	//The set will not repeat the duplicate
	}
	
	public static void callToProductClass() {
		Products<String, String> p1 = new Products<>("Name", "Description");
		String str = p1.getItem1();
		String str1 = p1.getItem2();
		
		System.out.println(p1);
	}
	
	//Using of Generic Method
	public static void getUnionOfSetValues() {
		Set<String> mySet1 = new HashSet<>();	//random order
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");
		
		Set<String> mySet2 = new TreeSet<>();	//natural order
		mySet2.add("DC");
		mySet2.add("VA");
		mySet2.add("MD");
		mySet2.add("PA");
		
		/* LinkedSet will keep insertion order */
		
		Set<String> resultSet = unionOfSets(mySet1, mySet2);
		
		Iterator<String> it = resultSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

//	private static Set<String> unionOfSets(Set<String> mySet1, Set<String> mySet2){
//		
//		return null;
//	}
	
	//Generic Method
	//The <E> added behind static, everybody will know it can be any data type. It can be E and any other value
	//The <E>s are the signature of this generic method
	private static<E> Set<E> unionOfSets(Set<E> mySet1, Set<E> mySet2){
		Set<E> results = new HashSet<>();
//		Set<E> results = new TreeSet<>();
		results.addAll(mySet1);
		results.addAll(mySet2);
		return results;		//return Set<E> type
	}
}
