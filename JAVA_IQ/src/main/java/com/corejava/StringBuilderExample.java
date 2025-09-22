package com.corejava;

public class StringBuilderExample {

	  public static void main(String[] args) {
	    StringBuilder temp = new StringBuilder();
	    // Initial size of object
	    System.out.println(temp.capacity());

	    StringBuilder sb = new StringBuilder("Scaler");
	    System.out.println(sb);

	    // Updating/Modifying the value of sb
	    sb.append(" Articles");
	    System.out.println(sb);
	  }
	}
