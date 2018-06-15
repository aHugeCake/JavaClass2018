package com.javasession.week_2.day3_compositions;

public class Factory_Brand extends Bike{

	public void setStart() {
		Engine e = new Engine();
		e.start();
	}
}
