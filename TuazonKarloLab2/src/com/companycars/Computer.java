package com.companycars;

public class Computer {
		private String name;
		private String gpu;
		private int ram;
		private String cpu;

		
		public Computer(String name, String gpu, int ram, String cpu){
			this.name = name;
			this.gpu = gpu;
			this.ram = ram;
			this.cpu = cpu;
				}
			
		
		public String getName() {
			return this.name;
		}
		
		public String getGpu() {
			return this.gpu;
		}
		
		public int getRam() {
			return this.ram;
		}
		
		public String getCpu() {
			return this.cpu;
		}

		
		
		public void print() {
			System.out.println("Device: "+ getName());
			System.out.println("GPU: "+ getGpu());
			System.out.println("Ram: "+ getRam());
			System.out.println("CPU: "+ getCpu());
			
		}
		
	}
