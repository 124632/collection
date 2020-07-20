package com.xworkz.java.Collection;

import java.util.ArrayList;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> trees = new ArrayList<String>();
		trees.add("Banian tree");
		trees.add("Oak tree");
		trees.add("Neem tree");
		trees.add("Mango tree");
		trees.add("papaya tree");
		ArrayList<String> medicines = new ArrayList<String>();
		medicines.add("paracitamol");
		medicines.add("Dolo");
		medicines.addAll(trees);
		System.out.println(medicines);
		System.out.println("Dolo is present ? :"+medicines.contains("Dolo"));
		medicines.remove("Dolo");
		System.out.println("Dolo is present ?:"+medicines.contains("Dolo"));
		medicines.retainAll(trees);
		System.out.println(medicines);
		System.out.println("size of medicines:"+medicines.size());
		medicines.clear();
		System.out.println("size of medicines:"+medicines.size());

	}

}
