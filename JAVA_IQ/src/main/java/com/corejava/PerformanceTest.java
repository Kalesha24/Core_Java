package com.corejava;

//Execution time test of StringBuffer and StringBuilder class
public class PerformanceTest {

	public static void main(String[] args) {

		// Time taken by String Buffer class
		long startTime = System.currentTimeMillis();
		StringBuffer sBuffer = new StringBuffer("TEST PERFORMANCE");
		for (int i = 0; i < 50000; i++) {
			sBuffer.append("Performance Testing");
		}
		System.out.println("Execution time of StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

		// Time taken by String Builder
		startTime = System.currentTimeMillis();
		StringBuilder sBuilder = new StringBuilder("TEST PERFORMANCE");
		for (int i = 0; i < 50000; i++) {
			sBuilder.append("Performance Testing");
		}
		System.out.println("Execution time for StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}