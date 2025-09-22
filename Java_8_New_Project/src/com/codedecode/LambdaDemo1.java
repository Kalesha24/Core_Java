package com.codedecode;

public class LambdaDemo1 {

	public static void main(String[] args) {

		LambdaDemo1 d1 = new LambdaDemo1();
		d1.add(5, 5);
	}

	private void add(int a, int b) {
		System.out.println(a + b);
	}
}
