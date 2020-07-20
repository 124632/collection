package com.xworkz.java.Collection;

import java.util.Comparator;

public class MyComparator2 implements Comparator<Toy>{

	@Override
	public int compare(Toy toy1, Toy toy2) {
		if(toy1.price<toy2.price)
			return 1;
		else if(toy1.price>toy2.price)
			return -1;
		else
		return 0;
	}

}
