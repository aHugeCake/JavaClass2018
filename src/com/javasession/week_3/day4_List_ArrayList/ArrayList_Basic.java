package com.javasession.week_3.day4_List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Basic {

	public static void main(String[] args) {
		// After Java 7, we don't need to mention the data type in the reference
		// Collection class does not support direct primitive data type, instead wrapper
		// class
		// String (String itself is a class), Integer(int) ,Long(long), Character(char),
		// Byte(byte), Short(short), Float(float), Double(double), Boolean(boolean)

		// List is an interface
		// ArrayList is not an interface
		// List<> vname = new ArrayList<>();
		// ArrayList<Integer> vname = new ArrayList<>()

		List<String> st = new ArrayList<>();
		System.out.println(st.size());

		// index: 0, 1, 2
		// add --> create index 3, then create element
		st.add("AA");
		st.add("BB");
		st.add("CC");
		System.out.println(st.size());
		System.out.println(st);

		// we can specify the index'
		// add "Test" in the middle of "AA" and "BB"
		st.add(1, "Test");

		System.out.println("Current List index: " + st);

		// remove particular index
		st.remove(0);
		// remove particular element
		st.remove("Test");
		System.out.println(st);

		// Replace some element
		st.set(0, "LL");
		System.out.println(st);
	}
}
