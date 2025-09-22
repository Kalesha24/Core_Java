package com.corejava.iq;
import java.util.Scanner;

public class DigitalRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int number = scanner.nextInt();

        int digitalRoot = calculateDigitalRoot(number);
        System.out.println("Digital Root :: " + digitalRoot);
    }

    public static int calculateDigitalRoot(int number) {
        while (number > 9) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
