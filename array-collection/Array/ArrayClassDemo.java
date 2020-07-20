package com.xworkz.java.Array;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Object[] objs = new Object[4];
		 objs[0] = 2;
		 objs[1] = 3;
		 objs[2] = 1;
		 objs[3] = 4;
		 System.out.println(Arrays.toString(objs));
		 Arrays.sort(objs);
		 System.out.println("After sorting....");
		 System.out.println(Arrays.toString(objs));
		 System.out.println("Copy of:" + Arrays.toString(Arrays.copyOf(objs,2)));
		 System.out.println("Copy of Range:"+ Arrays.toString(Arrays.copyOfRange(objs,1,3)));
		 Arrays.fill(objs,  5);

		 System.out.println("fill method:" +Arrays.toString(objs));
		 System.out.println("search method:" +Arrays.binarySearch(objs,4));
		 
		}

}
