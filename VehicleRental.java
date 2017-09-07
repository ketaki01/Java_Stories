package com.java.vehiclerental;

import java.util.Scanner;

public class VehicleRental {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Vehicle test = new Vehicle();
		TotalExpense output = new TotalExpense();

		System.out
				.print(" Please choose your travel origin from below: \n 1.Mumbai: 200 KM\n");
		System.out
				.println(" 2.Bangalore: 1000 KM \n 3.Delhi: 2050 KM \n 4.Chennai: 1234.5 KM \n 5. Pune:0 KM");
		int start = input.nextInt();

		System.out
				.print(" Please choose your travel destination from below: \n 1.Mumbai: 200 KM\n");
		System.out
				.println(" 2.Bangalore: 1000 KM \n 3.Delhi: 2050 KM \n 4.Chennai: 1234.5 KM \n 5. Pune:0 KM");
		int end = input.nextInt();

		System.out
				.println(" Please choose a vehicle type: \n 1. Car \n 2. SUV \n 3. Bus");
		int vehicleType = input.nextInt();

		int fuel = 0;
		if (vehicleType == 1) {
			System.out
					.println(" Please choose preference: \n 1.Petrol \n 2.Diesel");
			fuel = input.nextInt();
		}
		int prefer;
		if (vehicleType == 2) {
			prefer = 1;
		} else {
			System.out
					.println(" Please choose preference: \n 1.AC \n 2.non AC");
			prefer = input.nextInt();
		}

		System.out.println(" Please enter number of passengers:");
		int passenger = input.nextInt();

		test.setdistance(start, end);
		test.setperKmRate(prefer, vehicleType, fuel);
		test.setextraPassengers(passenger);
		test.settollCharge(start, end);
		output.rentalExpense(test.getDistance(), test.getPerKmRate(),
				test.getextraPassengers(), test.gettollCharge());
	}

}
