package com.xworkz.java.Collection;

public class Student {
	String name;
	Long phno;
	String emailId;
	double mockRate;
	int yearOfPassOut;
	double Persentage;
	
	Student(String name,Long phno,String emailId,double mockRate,int yearOfPassOut,double Persentage) {
		this.name= name;
		this.phno= phno;
		this.emailId= emailId;
		this.mockRate=mockRate;
		this.yearOfPassOut=yearOfPassOut;
		this.Persentage=Persentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phno=" + phno + ", emailId=" + emailId + ", mockRate=" + mockRate
				+ ", yearOfPassOut=" + yearOfPassOut + ", Persentage=" + Persentage + "]";
	}
	
	
	

}
