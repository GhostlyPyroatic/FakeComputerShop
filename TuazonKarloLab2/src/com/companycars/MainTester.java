package com.companycars;

public class MainTester {

	public static void main(String[] args) {
	/*Car AudiR8 = new Car("v10",4,"4wd");
	AudiR8.print();
	
	Truck Bigboi = new Truck("v8 Hemi + Charger", 16, "AWD", 16000, 398361);
	Bigboi.print();*/
		
	
	Computer vroom[] = new Computer[3];
		vroom[0] = new Laptop("Nitro 5","GTX 1050ti", 12," i5 8300h");
		vroom[1] = new Desktop ("Big Boss","Dual RTX 2080ti", 64, "i9 9900k", 7, 1200);
		vroom[2] = new Laptop ("Lenovo y540", "GTX 1660ti", 8, "i5 9300h");
						
		int price = 100000;
		int price2 = 234000;
		int tax = 3982;
		
	System.out.println("total price tag:" + total(price, price2));
	System.out.println("total w/ tax: " + total(price, price2, tax));
		
		for (Computer computer: vroom) {
			System.out.println();
			computer.print();
		}
		
	}

	private static int total(int a, int b) {
		return a + b;
	}

	private static int total(int a, int b, int c) {
		return a + b + c;
	}
}
