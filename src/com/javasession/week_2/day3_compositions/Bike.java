package com.javasession.week_2.day3_compositions;

public class Bike {

	private String color;
	private int wheels;
	
	public void bikeFeatures() {
		System.out.println("Bike Color = " + color + " wheels = " + wheels);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
}
