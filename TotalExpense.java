package com.java.vehiclerental;

public class TotalExpense {

	final double additionalPersonCharge = 1.5;

	public void rentalExpense(double distance, double perKmRate,
			int getextraPassengers, int tollCharge) {
		
		double expense = distance
				* (perKmRate + (additionalPersonCharge * getextraPassengers))
				+ tollCharge;

		System.out.println("Your total Rental Expense is : Rs." + expense);
	}

}
