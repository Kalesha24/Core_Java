package com.core;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 12, 10, 33, 40, 61, 12, 58, 33, 61);
		Set<Integer> s = new HashSet<Integer>();
		System.out.println("Duplicate Elements :: ");
		l.stream().filter(nums -> !s.add(nums)).forEach(System.out :: println);
	}

}
