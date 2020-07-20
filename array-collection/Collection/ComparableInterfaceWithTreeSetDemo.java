package com.xworkz.java.Collection;

import java.util.TreeSet;

public class ComparableInterfaceWithTreeSetDemo {
	public static void main(String[] args) {
		Toy toy1 = new Toy("Rubber Ducky","soft","Hamleys",200.00,"Green");
		Toy toy2 = new Toy("Teddy bear","soft","lego",500.00,"Pink");
		Toy toy3 = new Toy("Bicycle","Hard","Mattel",100.00,"Black");
		Toy toy4 = new Toy("Barbie","soft","lego",1000.00,"white");
		Toy toy5 = new Toy("Buck","Hard","Hamleys",50.00,"Green");
		
		TreeSet<Toy> toys = new TreeSet<Toy>(new MyComparator2());
		toys.add(toy1);
		toys.add(toy2);
		toys.add(toy3);
		toys.add(toy4);
		toys.add(toy5);
		
		for(Toy toy:toys) {
			System.out.println(toy);
		}
	}

}
