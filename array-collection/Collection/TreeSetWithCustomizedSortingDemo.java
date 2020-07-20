package com.xworkz.java.Collection;

import java.util.TreeSet;

public class TreeSetWithCustomizedSortingDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		ts.add(2);
		ts.add(1);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(7);
		System.out.println(ts);
		
		
		
	}

}
