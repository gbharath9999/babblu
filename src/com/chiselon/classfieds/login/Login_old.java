package com.chiselon.classfieds.login;

import sun.misc.GC.LatencyRequest;



public class Login_old {
	
	public static String getMessage(){
		
		String name ="barath";
		String lastName = name+"Goud";
		return lastName;
	}

	
	public static void main(String[] args) {
		
		String name =getMessage();
		
		System.out.println(name);
		
		AddressDetails details =setAddressDetailsData();
		System.out.println(details.getAddress());
		
		updateAddressDetails(details);
		
			
	}
	
	public static AddressDetails setAddressDetailsData(){
		
		AddressDetails addressDetails = new AddressDetails();
		
		addressDetails.setAddress("Beeramguda");
		addressDetails.setCity("Hyd");
		addressDetails.setState("TN");
		addressDetails.setPincode("502032");
		
		return addressDetails;
		
	}
	
	public static void updateAddressDetails(AddressDetails details ){
		
		System.out.println("update method...."+details.getAddress());
		
		details.setAddress("Mallikarjun Nagar");
		
		
	}
	
	}
