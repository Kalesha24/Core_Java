package com.corejava.chatgpt;

/*Company :: ADP*/

/*Given a list of integers, find out all the numbers starting with 1 using Stream functions? 
Input : {23, 34, 45, 56, 122, 43, 101, 67, 11, 98, 10}, 
Output : {10, 11, 101, 122}
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 34, 45, 56, 122, 43, 101, 67, 11, 98, 10);

        // Filter numbers starting with 1
        List<Integer> result = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());

        // Print the result
        System.out.println(result);
    }
}

/*
 * Output:- [122, 101, 11, 10]
 * 
 * Write a program in java 3956789 => 3+9+5+6+7+8+9 = 47 47 => 4+7 = 11 11 =>
 * 1+1 = 2 Ans:- 2
 * 
 */