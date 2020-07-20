package com.xworkz.java.Array;

public class HomegenesDemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Tree tree = new Tree("Mango",10.76);
            Bike bike = new Bike("Royle enfild", 56.000);
            House house = new House(124,"duplex");
            Bank bank = new Bank("HDFC","simple");
            
            Object[] objects = new Object[4];
            objects[0] = tree;
            objects[1] = bike;
            objects[2] = house;
            objects[3] = bank;
            
           // System.out.println( object);
            for(Object obj:objects) {
            	System.out.println(obj);
            }

	}

}
 