package com.corejava;

public class Singleton {

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	private static Singleton singleObject = null;

	private static Singleton getInstance() {
		if (singleObject == null) {
			singleObject = new Singleton();
		}
		return singleObject;
	}

	public static void main(String[] args) {
//		System.out.println("***************************");


		Singleton object1 = Singleton.getInstance();
		System.out.println(object1);

		Singleton object2 = Singleton.getInstance();
		System.out.println(object2);

		Singleton object3 = Singleton.getInstance();
		System.out.println(object3);
	
	}
}
