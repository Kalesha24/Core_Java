package com.core.java8features;

import java.util.function.BiConsumer;
import java.util.*;

public class LambdaDemo {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsmer = (a, b) -> System.out.println(a + b);
		biConsmer.accept(10, 6);
		Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
	}
}
