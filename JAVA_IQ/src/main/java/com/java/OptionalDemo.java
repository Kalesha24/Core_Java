package com.java;

import java.util.Optional;

public class OptionalDemo {

	/*
	 * 1. To avoid the NullPointerExceptions
	 * 2. 
	 * value is present or not present in that case it's tricky to write lot of
	 * checks and those checks are not readable that is the resin optional class was
	 * introduced. Optional can handle these scenario when the value is present or
	 * not present.
	 * 
	 */
	public static void main(String[] args) {

//		String value = "CloudTech";		//O/P:-Value is : CloudTech
//		String value = null; // java.util.NoSuchElementException: No value present
		String value = null;

		Optional<String> optional = Optional.ofNullable(value);
		if (optional.isPresent()) {
			System.out.println("Value is : " + optional.get());
		} else {
			// I want to print default value
			String defaultValue = optional.orElse("Default value");
			System.out.println("Value is not present : " + defaultValue);
		}

	}
}
