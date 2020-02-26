package com.companycars;

public class Laptop extends Computer{

	
	
	public  Laptop(String name, String gpu, int ram, String cpu) {
		super(name,gpu,ram, cpu);
	}


	public void print() {
		System.out.println("Laptop:");
		super.print();
	}
 

	
	
}
