package com.xworkz.java.abstraction;

public abstract class Watch {
	String brand;
	double price;
	String type;
	abstract void showTime();
	
	void alarm() {
		System.out.println("Time is now 5:30 AM");
	}
	

}
