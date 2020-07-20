package com.xworkz.java.Collection.stack;

public class Bird {
	String name;
	String type;
	
  Bird(String name,String type){
	  this.name = name;
	  this.type = type;
  }

@Override
public String toString() {
	return "Bird [name=" + name + ", type=" + type + "]";
}
  
}
