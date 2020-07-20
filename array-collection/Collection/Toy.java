package com.xworkz.java.Collection;

public class Toy {
	String name;
	String type;
	String brand;
	double price;
	String color;
	
  Toy(String name,String type,String brand,double price,String color){
	  this.name = name;
	  this.type = type;
	  this.brand = brand;
	  this.price = price;
	  this.color = color;
	  
  }
 /* public int compareTo(Toy toy) {
	  if(this.price<toy.price)//this one or another class creat MyComparator2
		  return -1;
	  else if(this.price>toy.price)
		  return 1;
	  else
		  return 0;
  }*/

@Override
public String toString() {
	return "Toy [name=" + name + ", type=" + type + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
}
  
}
