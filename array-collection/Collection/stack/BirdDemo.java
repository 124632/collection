package com.xworkz.java.Collection.stack;

import java.util.Enumeration;
import java.util.Stack;

public class BirdDemo {
	public static void main(String[] args) {
		Bird bird1 = new Bird("sparrow","flying");
		Bird bird2 = new Bird("peacock","flying");
		Bird bird3 = new Bird("penguin","not flying");
		Bird bird4 = new Bird("batsman","night travelling");
		Bird bird5 = new Bird("parrot","flying");
		Stack<Bird> birds = new Stack<Bird>();
		birds.push(bird1);
		birds.push(bird2);
		birds.push(bird3);
		birds.push(bird4);
		birds.push(bird5);
		birds.pop();
		
		System.out.println(birds.peek());
		System.out.println(birds.search(bird1));
		
		Enumeration<Bird> en = birds.elements();
		while (en.hasMoreElements()) {
			Bird bs = en.nextElement();
			if((bs.type.equals("flying"))) {
				System.out.println("flying:"+bs.name);
			}
			if((bs.type.equals("not flying"))) {
				System.out.println("not flying:"+bs.name);
			}
			if((bs.type.equals("night travelling"))) {
				System.out.println("night travelling:"+bs.name);
			}
			
		}
	}

}
