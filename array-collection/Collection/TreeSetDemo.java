package com.xworkz.java.Collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<StringBuffer>  treeSet = new TreeSet<StringBuffer>();
		treeSet.add(new StringBuffer("Xworkz"));
		treeSet.add(new StringBuffer("Deepak"));
		treeSet.add(new StringBuffer("ODC"));
		treeSet.add(new StringBuffer("Java"));
		System.out.println(treeSet);//StringBuffer is not a type of comparable 
		
		TreeSet <Comparable> treeSet1 = new TreeSet<Comparable>();
		treeSet1.add(1);
		treeSet1.add(null);
		treeSet1.add("a");
		treeSet1.add(true);
		System.out.println(treeSet1);//it doesn't support heterogeneous object & 
		//they doesn't allow null values 
	}

}
