package com.computershop;
import java.util.Scanner;


public class TuazonKarlo1 {

	public static void main(String[] args) {
	String acc;
	String add;
	String num;
	Scanner sc = new Scanner(System.in);
	
	
	Computer c1 = new Computer("Acer Nitro 5", "GTX 1050ti","i5", 8);
	Computer c2 = new Computer("Macbook Pro 13in", "Intel Graphics","i5", 16);
	Computer c3 = new Computer("Lenovo y569", "GTX 6900","i9", 16);
	

		System.out.println("Devices Connected:");
		System.out.println(c1.getName() +" w/ "+ c1.getGpu() +" and "+ c1.getProci() + " RAM:" + c1.getRam() +"GB");
		System.out.println(c2.getName() +" w/ "+ c2.getGpu() +" and "+ c2.getProci() + " RAM:" + c2.getRam() +"GB");
		System.out.println(c3.getName() +" w/ "+ c3.getGpu() +" and "+ c3.getProci() + " RAM:" + c3.getRam() +"GB");
	
	
		User admin = new User();
		
	System.out.print("Enter Admin's Name: ");
	acc =sc.next();
	admin.setName(acc);
	System.out.print("Enter Employee Code: ");
	add =sc.next();
	admin.setAdd(add);
	System.out.print("Enter Phone number: ");
	num =sc.next();
	admin.setNum(num);
	
	System.out.println("Name: "+ admin.getName1());
	System.out.println("Employee Number: "+ admin.getAdd2());
	System.out.println("Number: "+ admin.getNum3());

}

}
