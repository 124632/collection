package com.xworkz.java.Collection;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object O1, Object O2) {
		Integer i1=(Integer) O1;
		Integer i2=(Integer) O2;
		if(i1<i2) {
			return 1;
		}
		else if(i1>i2) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
