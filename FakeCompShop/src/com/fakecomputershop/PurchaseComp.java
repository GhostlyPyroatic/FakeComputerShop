package com.fakecomputershop;
import java.util.Scanner;

public class PurchaseComp {

	public static void main(String[] args) {
		
		String acc;
		String add;
		String password;
		//String passwordtwo;
		Scanner sc = new Scanner(System.in);
		//char pick;
		char proceed = 'n';

//Method
		System.out.print("Please enter password: ");
		password = sc.next();
		passgive(password);
		
		System.out.print("Enter Customer's Name: ");
		acc =sc.next();
		System.out.print("Enter Customer's Address: ");
		add =sc.next();
		accgive(acc,add);
		
		
		do {
		
			//display();
			//select(pick);
	
		}while(proceed =='y');
	}
	
//=============================================================================================================
	private static void passgive(String password) {
		System.out.println(password);
		}
//=============================================================================================================
	private static void accgive(String acc, String add) {
		System.out.println(acc);
		System.out.println(add);
	}
//=============================================================================================================
/*	private static void display() {
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
				
			}
		*/
		

	
	
}
