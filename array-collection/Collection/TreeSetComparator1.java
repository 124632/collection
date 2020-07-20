package com.xworkz.java.Collection;

import java.util.TreeSet;

public class TreeSetComparator1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyComparator1());
		ts.add("seema");
		ts.add("ashwitha");
		ts.add("hema");
		ts.add("madhu");
		ts.add("asha");
		ts.add("akshtha");
		System.out.println(ts);

		}

}
