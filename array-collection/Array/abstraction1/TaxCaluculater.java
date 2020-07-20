package com.xworkz.java.abstraction1;

public class TaxCaluculater implements StateTax,CentralTax {
	public void houseTax() {
		System.out.println(" houseTax is 500 for a year");
		
	}
	public void roadTax() {
		System.out.println(" roadTax is 1000 for a year");
	}

}
