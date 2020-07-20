package com.xworkz.java.Collection;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetDemo {
	public static void main(String[] args) {
		
		AadarCard aadarcard1 = new AadarCard("Asha",2345678919l,"1997-01-05");
		AadarCard aadarcard2 = new AadarCard("Bhagya",2345878919l,"1995-05-06");
		AadarCard aadarcard3 = new AadarCard("Kavya",2315678919l,"1998-04-04");
		AadarCard aadarcard4 = new AadarCard("Mamatha",2345678119l,"1995-06-03");
		AadarCard aadarcard5 = new AadarCard("Asha",2345678919l,"1996-01-05");
		
		
		HashSet<AadarCard> aadarcards = new HashSet<AadarCard>();
		
		aadarcards.add(aadarcard1);
		aadarcards.add(aadarcard2);
		aadarcards.add(aadarcard3);
		aadarcards.add(aadarcard4);
		aadarcards.add(aadarcard5);
		
		
		/*for(AadarCard aadarcard : aadarcards) {
			System.out.println(aadarcard);
		}*/
		for(AadarCard aadarcard : aadarcards) {
			LocalDate date1 = LocalDate.parse("1998-04-04");
			LocalDate date2 = LocalDate.parse(aadarcard.dob);
		  if(date1.compareTo(date2)>=1) {	
			System.out.println(aadarcard);
		  
		  }
		}
		
	}

}
