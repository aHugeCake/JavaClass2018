package com.javasession.week_1.day4_Method;

public class SampleTestOfInstanceVariable {
	String myInstVar = "Test for Instance Variable";
	public static void main(String[] args) {
		
		//String myInstVar = "Test for Instance Variable";
		
		SampleTestOfInstanceVariable st  = new SampleTestOfInstanceVariable();
		SampleTestOfInstanceVariable st1  = new SampleTestOfInstanceVariable();
		SampleTestOfInstanceVariable st2  = new SampleTestOfInstanceVariable();
		
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println(st.myInstVar);
		System.out.println(st1.myInstVar);
		System.out.println(st2.myInstVar);
		
		//You can use the instance to change the value
		st1.myInstVar = "Change the test";
		
		System.out.println(st.myInstVar);
		System.out.println(st1.myInstVar);
		System.out.println(st2.myInstVar);
	}
}
