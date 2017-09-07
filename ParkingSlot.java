package com.java.parking;

import java.util.Scanner;

public class ParkingSlot {
	
	public static void main(String [] args){
	
	Scanner input= new Scanner(System.in);
	
	System.out.println("Do you wish to park Vehicle ? Type 1 or 0");
	int response= input.nextInt();
	if(response==1){
		Parking entry= new Parking();
		entry.checkSlotAvailability();
	}
	
	}

}
