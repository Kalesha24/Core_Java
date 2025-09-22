package com.java;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		User user=new User();
//		System.out.println(user.getUserName());
		
//		if (user.getUserName().equalsIgnoreCase("Kalesha...")) {
//			System.out.println("Name is equals to Kalesha");
//		} else {
//			System.out.println("Name is not matched");
//		}
		
		Optional<String> optionalUser = user.getUserName();
		if(optionalUser.isPresent() && optionalUser.get().equalsIgnoreCase("Kalesha...")) {
			System.out.println("Name is equals to Kalesha...");
		} else {
			System.out.println("Not equal");
		}
	}
}

class User {
	private String userName;

//	public String getUserName() {
//		return userName;
//	}
	
	public Optional<String> getUserName() {
		return Optional.ofNullable(userName);
	}
}