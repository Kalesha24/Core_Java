package com.corejava;

public class StringBufferExample {

	public static void main(String[] args) {

		// Empty StringBuffer object
		StringBuffer temp = new StringBuffer();

		// Intial size of object
		System.out.println(temp.capacity());

		StringBuffer buffer = new StringBuffer("Scaler");
		System.out.println(buffer);

		// Updating/Modifying the buffer object
		buffer.append(" Academy");
		System.out.println(buffer);
	}
}
