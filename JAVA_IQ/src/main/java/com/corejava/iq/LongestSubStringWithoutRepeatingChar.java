package com.corejava.iq;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		lengthOfTheLongestSubString("Helloworld");
	}

	private static void lengthOfTheLongestSubString(String s) {
		
		String longestSubString = null;
		int longestSubStringLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		}
		System.out.println("The Longest SubString is : " + longestSubString);
		System.out.println("The Longest Substring Length is : " + longestSubStringLength);
	}
}

/*
 * Output: The Longest SubString is : [w, o, r, l, d] The Longest Substring
 * Length is : 5
 * 
 * sample java code String[] str =
 * {'aabchd','aabchk','aabckj','aabdh','aabchl'}; to find out common string in
 * string[]
 */