package com.java;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {

		String str = null;

		Optional<String> optional = Optional.ofNullable(str);

		if (optional.isPresent()) {
			System.out.println("Value is : " + optional.get());
		} else {
			String value = optional.orElse("This is default value");
			System.out.println("Value is not present : " + value);
		}
	}
}
