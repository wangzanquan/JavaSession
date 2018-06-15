package com.javasession.compositions;

public class Bike {
	private String color;
	private int wheel;
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setWheels(int num) {
		this.wheel = num;
	}
	
	void bikeFeatures() {
		System.out.println("Color: " + this.color + "\nWheel num: " +this.wheel);
	}


	
}
