package com.javasession.week_4.day3_Generics;

public class PureGenericsClass<i1, i2> {		//We'd better use capital letter
	i1 item1;
	i2 item2;
	public PureGenericsClass(i1 item1, i2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	public i1 getItem1() {
		return item1;
	}
	public void setItem1(i1 item1) {
		this.item1 = item1;
	}
	public i2 getItem2() {
		return item2;
	}
	public void setItem2(i2 item2) {
		this.item2 = item2;
	}
	
}
