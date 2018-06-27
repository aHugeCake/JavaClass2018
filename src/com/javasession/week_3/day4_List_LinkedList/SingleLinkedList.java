package com.javasession.week_3.day4_List_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class SingleLinkedList {

	public static void main(String[] args) {
		linkedList();
	}
	
	/*
	 * LinkedList does not preserve the order
	 * 		-> guarantee on procession, much faster than ArrayList
	 */

	/*
	 * Single LinkedList
	 * Every linked list has a head and a tail and references a number which maps refernece of the next index
	 * Double LinkedList --> next node and previous node
	 * This sample is Single Linkedlist
	 */
	public static void linkedList() {
		LinkedList<String> link = new LinkedList<>();
		
		link.add("DC");
		link.add("New York");
		link.add("Boston");
		link.add("Baltimore");
		
		System.out.println("Full City List: " + link);
		
		link.addFirst("Chicago");
		link.addLast("Houston");
		
		System.out.println("After adding city: " + link);
		
		Object firstVar = link.get(0);
		Object thirdVar = link.get(3);
		System.out.println(firstVar + " " + thirdVar);
		
		link.set(0,"SFO");
		link.set(3, "Kensas");
		
		System.out.println("After Set: " + link);
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Phoenix");
		arrList.add("San Antonio");
		arrList.add("Dallas");
		
		//addAll ---> add another list to another list
		//		 ---> add multiple lists to one list
		link.addAll(arrList);
		
		System.out.println("After Adding ArrayList: " + link);
		
		System.out.println("Index for NewYork City: " + link.indexOf("New York"));
		
		//clear --> empty the entire list, remove all the elements of the list
		link.clear();
		System.out.println("Clear all list: " + link);
		
	}
}
