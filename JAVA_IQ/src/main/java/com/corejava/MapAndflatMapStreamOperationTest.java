package com.corejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndflatMapStreamOperationTest {

	public static void main(String[] args) {

		Map<String, List<String>> peopleNameAndPhonesMap = new HashMap<>();
		peopleNameAndPhonesMap.put("Kalesha", Arrays.asList("97044-31860", "89857-33122"));
		peopleNameAndPhonesMap.put("Khadar", Arrays.asList("99660-96066", "98855-80403"));
		peopleNameAndPhonesMap.put("Amar", Arrays.asList("98855-89030", "63056-11355"));

		// Use of flatMap using stream to get all phones
		List<String> phoneList = peopleNameAndPhonesMap.values().stream().flatMap(Collection::stream)
				.collect(Collectors.toList());

		phoneList.forEach(System.out::println);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// Use of map stream to get all phones
		List<Stream<String>> phonesList = peopleNameAndPhonesMap.values().stream().map(Collection::stream)
				.collect(Collectors.toList());
		for (Stream<String> PhoneStream : phonesList) {
			List<String> phones = PhoneStream.collect(Collectors.toList());
			System.out.println(phones);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// Use of map stream to get all user names
		Set<String> namesList = peopleNameAndPhonesMap.keySet().stream().map(s -> s).collect(Collectors.toSet());
		namesList.forEach(System.out::println);

	}
}
