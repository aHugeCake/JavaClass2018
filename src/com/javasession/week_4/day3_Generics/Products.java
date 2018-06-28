package com.javasession.week_4.day3_Generics;

public class Products<L1,L2> {	//Using capital letter for parameters for generic class

//	String item1;
//	String item2;
//	
//	
//	public Products(String item1, String item2) {
//		super();
//		this.item1 = item1;
//		this.item2 = item2;
//	}
//	public String getItem1() {
//		return item1;
//	}
//	public void setItem1(String item1) {
//		this.item1 = item1;
//	}
//	public String getItem2() {
//		return item2;
//	}
//	public void setItem2(String item2) {
//		this.item2 = item2;
//	}
	
	L1 item1;	//L1, L2 means it allows any data type in the future
	L2 item2;
	public Products(L1 item1, L2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	public L1 getItem1() {
		return item1;
	}
	public void setItem1(L1 item1) {
		this.item1 = item1;
	}
	public L2 getItem2() {
		return item2;
	}
	public void setItem2(L2 item2) {
		this.item2 = item2;
	}
	@Override
	public String toString() {
		return "Products [item1=" + item1 + ", item2=" + item2 + "]";
	}
	
//	public static void main(String[] args) {
//		Products p1 = new Products(String name, String disp);	//p1 does not accept other data types except two strings
//		Products p2 = new Products(String name, int price);
//	}
}
