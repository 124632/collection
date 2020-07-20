package com.xworkz.java.Collection;

public class AadarCard {
	String name;
	long number;
	String dob;
	
	
	AadarCard(String name,long number, String dob){
		this.name = name;
		this.number = number;
		this.dob = dob;
		
		
	}


	@Override
	public String toString() {
		return "AadarCard [name=" + name + ", number=" + number + ", dob=" + dob + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AadarCard other = (AadarCard) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	

}
