package com.xworkz.java.Collection;

import java.util.Comparator;

public class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
	    return	s2.compareTo(s1);//desending order
	    
	    
	    //return s1.compareTo(s2);//asending order
	    //return -s2.compareTo(s1);//asending order 
	    //return -s1.compareTo(s2);//desending order 


	}
	

}
