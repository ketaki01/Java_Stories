package com.java.vehiclerental;

public class Vehicle {

	private double start, end, distance;
	private double perKmRate = 11;
	private int extraPassengers;
	final int minPassenger = 5;
	private int tollCharge;

	public void setdistance(int start, int end) {
		switch (start) {
		case 1: {
			this.start = 200;
		}
			break;
		case 2: {
			this.start = 1000;
		}
			break;
		case 3: {
			this.start = 2050;
		}
			break;
		case 4: {
			this.start = 1234.5;
		}
			break;
		default: {
			this.start = 0;
		}
		}
		switch (end) {
		case 1: {
			this.end = 200;
		}
			break;
		case 2: {
			this.end = 1000;
		}
			break;
		case 3: {
			this.end = 2050;
		}
			break;
		case 4: {
			this.end = 1234.5;
		}
			break;
		default: {
			this.end = 0;
		}
		}
		if (this.start >= this.end) {
			this.distance = this.start - this.end;
		} else {
			this.distance = this.end - this.start;
		}

	}

	public double getDistance() {
		return this.distance;
	}

	public void setperKmRate(int prefer, int vehicleType, int fuel) {
		switch (vehicleType) {
		case 1: {
			if (fuel == 2) {
				if (prefer == 2) {
					this.perKmRate = (this.perKmRate - 1) - 2;
				} else {
					this.perKmRate = this.perKmRate - 1;
				}
			} else {
				if (prefer == 2) {
					this.perKmRate = this.perKmRate - 2;
				} else {
					perKmRate = 11;
				}
			}
		}
			break;

		case 2: {
			if (prefer == 2) {
				this.perKmRate = (this.perKmRate - 1) - 2;
			} else {
				this.perKmRate = this.perKmRate - 1;
			}

		}
			break;

		case 3: {
			if (fuel == 2) {
				if (prefer == 2) {
					this.perKmRate = 0.8 * ((this.perKmRate - 1) - 2);
				} else {
					this.perKmRate = 0.8 * (this.perKmRate - 1);
				}
			} else {
				if (prefer == 2) {
					this.perKmRate = 0.8 * (this.perKmRate - 2);
				}
			}
		}
			break;
		}
	}

	public double getPerKmRate() {
		return this.perKmRate;
	}

	public void setextraPassengers(int passenger) {
		// TODO Auto-generated method stub
		if (passenger >= this.minPassenger) {
			this.extraPassengers = passenger - this.minPassenger;
		} else {
			this.extraPassengers = 0;
		}
	}

	public int getextraPassengers() {
		// TODO Auto-generated method stub
		return this.extraPassengers;
	}

	public void settollCharge(int start, int end) {
		// TODO Auto-generated method stub
		if (start == 1 && (end == 2 || end == 5)) {
			this.tollCharge = 100;
		}

		else {
			if ((start == 2 && end == 1) || (start == 5 && end == 1)) {
				this.tollCharge = 100;
			} else {
				this.tollCharge = 0;
			}
		}
	}

	public int gettollCharge() {
		// TODO Auto-generated method stub
		return this.tollCharge;
	}

}
