package com.javasession.week_3.day1_AbstractClass;

public class AbstractClass_Demo extends Sum{

	@Override
	public int sumOfTwo(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@Override
	public int sumOfThree(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		return n1 + n2 + n3;
	}
	
	public static void main(String[] args) {
		Sum sm = new AbstractClass_Demo();
		System.out.println(sm.sumOfTwo(23,24));
		System.out.println(sm.sumOfThree(34, 35, 36));
		sm.desp();
	}

}

abstract class Sum{
	public abstract int sumOfTwo(int n1, int n2);
	public abstract int sumOfThree(int n1, int n2, int n3);
	
	public void desp() {
		System.out.println("method from sum");
	}
}