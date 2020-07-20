package com.xworkz.java.abstraction1;

public class ComputerDemo {
	public static void main(String[] args) {
		Sony sony = new Sony();
		Epson epson = new Epson();
		computer computer = new computer();
		computer.slot(sony);
		computer.slot(epson);
		
	}

}
