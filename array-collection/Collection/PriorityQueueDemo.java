package com.xworkz.java.Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Character> pq = new PriorityQueue<Character>();
		pq.offer('A');
		pq.offer('C');
		pq.offer('C');
		pq.offer('B');
		pq.offer('D');
		System.out.println(pq);
	}

}
