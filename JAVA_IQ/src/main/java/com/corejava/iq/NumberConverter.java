package com.corejava.iq;
public class NumberConverter {
    public static void main(String[] args) {
        int number = 3956789;
        
        while (number > 9) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            number = sum;
        }
        
        System.out.println("Result :: " + number);
    }
}





