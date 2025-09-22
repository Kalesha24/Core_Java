package com.java.interviewquestions;

import java.util.HashMap;

public class RepeatedCharactersCount {

    public static void main(String[] args) {
        String str = "The quick brown fox jumped over the lazy dog";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " : " + map.get(key));
            }
        }
    }
}