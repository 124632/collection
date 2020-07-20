package com.xworkz.java.Collection;

import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentlist = new ArrayList<Student>();
		Student student1 = new Student("Pooja",4325658955l,"Pooja@gmail.com",6.5,2019,85);
		Student student2 = new Student("Gayathri",4305678955l,"gayu@gmail.com",7.5,2018,85);
		Student student3 = new Student("susma",4325678955l,"susma@gmail.com",8,2019,75);
		Student student4 = new Student("arti",4325698955l,"arti@gmail.com",8.5,2017,86);
		Student student5 = new Student("asha",4326678955l,"asha@gmail.com",9,2019,80);
		
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		studentlist.add(student4);
		studentlist.add(student5);
		
		for(Student student:studentlist) {
			if(student.mockRate>6 && student.Persentage>70)
			System.out.println(student);	
		}
		
		

	}

}
