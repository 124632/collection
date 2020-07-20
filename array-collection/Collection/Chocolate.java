package com.xworkz.java.Collection;

public class Chocolate {
	String name;
	String type;
	double price;
	
   Chocolate(String name,String type,double price){
	    this.name = name;
	    this.type = type;
	    this.price = price;
   }

@Override
public String toString() {
	return "Chocolate [name=" + name + ", type=" + type + ", price=" + price + "]";
}


   
}
