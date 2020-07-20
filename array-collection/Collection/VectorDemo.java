package com.xworkz.java.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Chocolate chocolate1 = new Chocolate("DairyMilk","mild",80.00);
		Chocolate chocolate2 = new Chocolate("Kit Kat","Wafer",20.00);
		Chocolate chocolate3 = new Chocolate("Munch","Wafer",10.00);
		Chocolate chocolate4 = new Chocolate("5 star","Caramol",10.00);
		Chocolate chocolate5 = new Chocolate("Ferero","Wafer",30.00);
		Chocolate chocolate6 = new Chocolate("Parle","mild",2.00);
		
		
		Vector<Chocolate> chocolates = new Vector<Chocolate>();

		
		chocolates.addElement(chocolate1);
		chocolates.addElement(chocolate2);
		chocolates.addElement(chocolate3);
		chocolates.addElement(chocolate4);
		chocolates.addElement(chocolate5);
		chocolates.addElement(chocolate6);
		
		Enumeration<Chocolate> eChocolates = chocolates.elements();
		 System.out.println("Below are the chocolates are type Wafer:");
		 
         while(eChocolates.hasMoreElements()) {
        	 Chocolate chocolate = eChocolates.nextElement();
        	 if(chocolate.type.equals("Caramol")) {
        		 
        		 System.out.println(chocolate.name);
        	 }
         }
	}

}
