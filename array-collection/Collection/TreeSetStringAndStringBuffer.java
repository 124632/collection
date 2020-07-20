package com.xworkz.java.Collection;
/*write a program to insert StringBuffer and String value into tree set
*where sorting order increasing length order if two objects equal in length
*the consider aiphabitic order*/

import java.util.TreeSet;

  public class TreeSetStringAndStringBuffer {
	  public static void main(String[] args) {
		TreeSet<CharSequence> ts=new TreeSet<CharSequence>(new MyComparatorTreeSetStringAndStringBuffer());
		ts.add("wish");
		ts.add(new StringBuffer("you"));
		ts.add("happy");
		ts.add(new StringBuffer("new"));
		ts.add("year");
		System.out.println(ts);
	}

}
