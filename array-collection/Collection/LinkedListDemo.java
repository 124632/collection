package com.xworkz.java.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jewellery jewellery1 = new Jewellery("Gold",10.00,4500,"Kalyan Jewellery");
		Jewellery jewellery2= new Jewellery("Platinum",10.00,100000,"Malabar Jewellery");
		Jewellery jewellery3 = new Jewellery("Diamond",10.00,6500,"Tanishq Jewellery");
		Jewellery jewellery4 = new Jewellery("Siliver",10.00,140000,"GRT Jewellery");
		Jewellery jewellery5 = new Jewellery("Ruby",10.00,4700,"Asha Jewellery");
		LinkedList<Jewellery> jewelleries = new LinkedList<Jewellery>();
		jewelleries.add(jewellery1);
		jewelleries.add(jewellery2);
		jewelleries.add(jewellery3);
		jewelleries.add(jewellery4);
		jewelleries.add(jewellery5);
		
		Iterator<Jewellery> itr = jewelleries.iterator();
		while(itr.hasNext()) {
			Jewellery jewellery = itr.next();
			if(jewellery.type.equals("Ruby")) {
				System.out.println("Seller of Ruby is:"+jewellery);
			}
		}
	}

}
