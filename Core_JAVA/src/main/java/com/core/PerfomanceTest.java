package com.core;

public class PerfomanceTest {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("java");

		for (int i = 0; i < 10000; i++) {
			buffer.append("Tpoint");
		}
		System.out.println("Time Taken By StringBuffer  : " + (System.currentTimeMillis() - startTime) + "-milliseconds");

		startTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("java");

		for (int i = 0; i < 10000; i++) {
			builder.append("Tpoint");
		}
		System.out.println("Time Taken By StringBuilder : " + (System.currentTimeMillis() - startTime) + "-milliseconds");
	}
}
