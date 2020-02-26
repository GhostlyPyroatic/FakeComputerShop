 package com.companycars;

public class Desktop extends Computer{
private int size;
private int wattage;

public Desktop(String name, String gpu, int ram, String cpu, int size, int wattage) {
	super(name,gpu,ram, cpu);
	this.size = size;
	this.wattage = wattage;
}
public void print() {
	System.out.println("Desktop: ");
	super.print();
	System.out.println("Volume Size: "+ size +"Liters");
	System.out.println("Wattage rated: " + wattage);
	
}
}
