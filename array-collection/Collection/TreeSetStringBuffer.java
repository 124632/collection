package com.xworkz.java.Collection;

import java.util.TreeSet;

public class TreeSetStringBuffer {
	public static void main(String[] args) {
		TreeSet<StringBuffer> ts=new TreeSet<StringBuffer>(new MyComparatorStringBuffer());
		ts.add(new StringBuffer("seema"));
		ts.add(new StringBuffer("ashwitha"));
		ts.add(new StringBuffer("hema"));
		ts.add(new StringBuffer("madhu"));
		ts.add(new StringBuffer("asha"));
		ts.add(new StringBuffer("akshtha"));
		System.out.println(ts);
	}

}
