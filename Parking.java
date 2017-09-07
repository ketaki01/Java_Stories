package com.java.parking;

import java.util.Scanner;

public class Parking {

	public void checkSlotAvailability() {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		CheckSlot test= new CheckSlot();
		System.out.println("Do you wish to park in Big Slot or Small Slot? Type '1' for Big Slot or Type '2' for Small Slot");
		int chooseSlot= input.nextInt();
		if(chooseSlot==1){
			while(test.checkbigAvailability()== true){
				System.out.println("Please insert you Vehicle Number");
				String number = input.next();
				test.parkBigVehicle(number);
			}
			System.out.println("Sorry, we are out of Big Slots to Park the Car");
		}
		else{
			while(test.checksmallAvailability()== true){
				System.out.println("Please insert you Vehicle Number");
				String number = input.next();
				test.parkSmallVehicle(number);
			}
			System.out.println("Sorry, we are out of Small Slots to Park the Car");
		}
	}
}
