package com.computershop;

public class Computer {



	private String name;
	private String gpu;
	private String proci;
	private int ram;

	Computer(String name, String gpu, String proci, int ram){
		this.name = name;
		this.gpu = gpu;
		this.proci = proci;
		this.ram = ram;
		
		System.out.println("Device connected! collecting info...");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGpu() {
		return this.gpu;
	}

	public String getProci() {
		return this.proci;
	}

	public int getRam() {
		return this.ram;
	}

}
