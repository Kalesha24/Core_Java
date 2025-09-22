package com.java;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {

		String str = "";
		Optional<String> opt = Optional.of(str);

		if (opt.isPresent()) {
			System.out.println("Value is present");
		} else {
			System.out.println("Value is not-present");
		}
	}
}
