package com.xworkz.java.Collection;

public class Jewellery {
	String type;
	double weight;
	double price;
	String sellers;
	Jewellery(String type,double weight,double price,String sellers){
		this.type = type;
		this.weight = weight;
		this.price = price;
		this.sellers = sellers;

		}
	@Override
	public String toString() {
		return "Jewellery [type=" + type + ", weight=" + weight + ", price=" + price + ", sellers=" + sellers + "]";
	}
	
	

}
