package com.java.parking;

import java.util.HashMap;
import java.util.Map;

public class CheckSlot {
	private int totalSlot= 350;
	private int bigSlot= 100;
	private int smallSlot=150;
	private static int counttotalSlot=0;
	private static int countbigSlot=0;
	private static int countsmallSlot=0;
	private Map <Integer,String> parkbigEntry= new HashMap();
	private Map <Integer,String> parksmallEntry= new HashMap();
	
	public boolean checkbigAvailability(){
		if(counttotalSlot > totalSlot){
		return false;
		}
		else{
			if(countbigSlot < bigSlot){
				return true;
			}
			else{
				return false;
			}
		}	
		
	}
	
	public boolean checksmallAvailability(){
		if(counttotalSlot > 350){
		return false;
		}
		else{
			if(countsmallSlot < smallSlot){
				return true;
			}
			else{
				return false;
			}
		}		
	}

	public void parkBigVehicle(String number) {
		// TODO Auto-generated method stub
		parkbigEntry.put((countbigSlot + 1), number.toUpperCase());
		System.out.println("Your Vehicle is parked Successfully");
		countbigSlot++;
		counttotalSlot=countbigSlot + countsmallSlot;
		System.out.println(countbigSlot);
		System.out.println(counttotalSlot);
	}
	
	public void parkSmallVehicle(String number) {
		// TODO Auto-generated method stub
		parkbigEntry.put((countsmallSlot + 1), number.toUpperCase());
		System.out.println("Your Vehicle is parked Successfully");
		countsmallSlot++;
		counttotalSlot=countbigSlot + countsmallSlot;
		System.out.println(countsmallSlot);
		System.out.println(counttotalSlot);
	}

}
