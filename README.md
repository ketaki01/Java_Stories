Car rental:
You are tired of writing the code for many years and have decided to open a car rental
business.
For that you need a program which calculates the total expense for the trip.

So you decide to write a one last code for it.

Story 1:
A vehicle can be rented for a trip.

Vehicle can be a car, SUV or bus.

The standard rate for a petrol vehicle for a standard trip is 9 rs/km.

Additional 2 rs/km charge is applicable for AC vehicles.

Diesel vehicles cost a rupee less than standard rate.

SUV and bus always run on diesel.

SUV is always AC.

2% discount is applicable for bus on standard rate.

Calculate the total expense for the trip.

The route of the trip always passes via Pune.

All the distances to all destinations are specified in KM from Pune.

Sample Input:
Distance:
Pune: 0KM
Mumbai: 200KM
Bangalore: 1000KM
Delhi: 2050KM
Chennai: 1234.5KM
Trip: Swift Diesel NON_AC, Pune-Mumbai
Output: Total Expense: 1600
Trip: "Mahindra XUV 500", Mumbai-Bangalore
Output: Total Expense: 12000
Trip: "Tata Skyline", AC, Mumbai-Bangalore
Output: Total Expense: 11760
Car rental:
Story 2:
Additional charges of 1.
5 rs/km/person are charged if number of passengers exceed the
max limit of vehicle
Max limit for any car is 5.

Trip: Swift Diesel NON_AC, Pune-Mumbai, 7 Passengers
Output: Total Expense: 2400
Trip: "Tata Skyline", AC, Mumbai-Bangalore, 45
Output: Total Expense: 20760
Car rental:
Story 3:
Toll charges are applicable for specified destinations.

Toll charges can be multiple for a destination.

Trip: Swift Diesel NON_AC, Pune-Mumbai Toll: 100, 5 Passengers
Output: Total Expense: 1900
Trip: "Mahindra XUV 500", Mumbai-Bangalore Toll:100, 150, 7
Passengers,
Output: Total Expense: 12250
Car rental:
Story 4:
Calculate total fuel expenses for the trip.
 Fule expense are not included in total expense.

Rates for Petrol: 80Rs/L
Rates for Diesel: 60Rs/L
AC vehicles give less milage by 2km/L
Trip: Swift Petrol NON_AC, Pune-Mumbai
Output: Total Expense: 1600
Fule Expense: 600
Trip: Swift Diesel AC, Pune-Mumbai
Output: Total Expense: 1600
Fule Expense: 800
