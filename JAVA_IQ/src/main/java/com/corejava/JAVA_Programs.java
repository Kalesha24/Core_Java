
// To find duplicate characters in a string using java ?
/*
 * package com.corejava; import java.util.HashMap; import java.util.Map;
 * 
 * public class DuplicateCharacters { public static void main(String[] args) {
 * String str = "Hello World"; printDuplicateCharacters(str); }
 * 
 * public static void printDuplicateCharacters(String str) { // Create a HashMap
 * to store character frequency HashMap<Character, Integer> charCountMap = new
 * HashMap<>();
 * 
 * // Convert the string to lowercase to ignore case sensitivity str =
 * str.toLowerCase();
 * 
 * // Convert the string to character array char[] characters =
 * str.toCharArray();
 * 
 * // Iterate through each character in the array for (char ch : characters) {
 * if (charCountMap.containsKey(ch)) { // If the character is already present in
 * the map, increment its count by 1 charCountMap.put(ch, charCountMap.get(ch) +
 * 1); } else { // If the character is not present in the map, add it with a
 * count of 1 charCountMap.put(ch, 1); } }
 * 
 * // Iterate through the map and print the characters with count > 1
 * System.out.println("Duplicate characters in the string:"); for
 * (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) { if
 * (entry.getValue() > 1) { System.out.println(entry.getKey() + ": " +
 * entry.getValue()); } } } } Output:- Duplicate characters in the string: l: 3
 * o: 2
 **********************************************************************************************************************************
 * 
 * 
 * // Easiest code for to find duplicate characters in a string using java
 * public class DuplicateCharacters { public static void main(String[] args) {
 * String str = "Hello World!";
 * 
 * // Convert the string to lowercase to make the comparison case-insensitive
 * str = str.toLowerCase();
 * 
 * // Create a frequency array to track occurrences of each character int[]
 * frequency = new int[26];
 * 
 * // Iterate over each character in the string for (int i = 0; i <
 * str.length(); i++) { char ch = str.charAt(i);
 * 
 * // Increment the frequency count for the character frequency[ch - 'a']++; }
 * 
 * // Print the duplicate characters for (int i = 0; i < frequency.length; i++)
 * { if (frequency[i] > 1) { char ch = (char) (i + 'a'); System.out.println(ch);
 * } } } }
 * 
 * Output:- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 * Index -65 out of bounds for length 26 at
 * com.corejava.practice.DuplicateCharacters.main(DuplicateCharacters.java:17)
 **********************************************************************************************************************************
 * 
 * 
 * // To find duplicate characters in a string in java public class
 * DuplicateCharacters { public static void main(String argu[]) { String str =
 * "beautiful beach"; char[] carray = str.toCharArray();
 * System.out.println("The string is:" + str);
 * System.out.print("Duplicate Characters in above string are: ");
 * 
 * for (int i = 0; i < str.length(); i++) { for (int j = i + 1; j <
 * str.length(); j++) { if (carray[i] == carray[j]) { System.out.print(carray[j]
 * + " "); break; } } } } }
 * 
 * Output:- The string is:beautiful beach Duplicate Characters in above string
 * are: b e a u
 **********************************************************************************************************************************
 * 
 * 
 * public class DuplicateCharacters { public static void main(String[] args) {
 * String string1 = "Great responsibility"; int count;
 * 
 * //Converts given string into character array char string[] =
 * string1.toCharArray();
 * 
 * System.out.println("Duplicate characters in a given string: "); //Counts each
 * character present in the string for(int i = 0; i <string.length; i++) { count
 * = 1; for(int j = i+1; j <string.length; j++) { if(string[i] == string[j] &&
 * string[i] != ' ') { count++; //Set string[j] to 0 to avoid printing visited
 * character string[j] = '0'; } } //A character is considered as duplicate if
 * count is greater than 1 if(count > 1 && string[i] != '0')
 * System.out.println(string[i]); } } }
 * 
 * Output:- Duplicate characters in a given string: r e t s i
 **********************************************************************************************************************************
 * 
 * 
 * //write a program to find longest substring from the given string without
 * duplicates package com.corejava.iq;
 * 
 * import java.util.LinkedHashMap; import java.util.Map;
 * 
 * public class LongestSubStringWithoutRepeatingChar {
 * 
 * public static void main(String[] args) {
 * 
 * lengthOfTheLongestSubString("Helloworld"); }
 * 
 * private static void lengthOfTheLongestSubString(String s) {
 * 
 * String longestSubString = null; int longestSubStringLength = 0;
 * Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
 * 
 * char[] arr = s.toCharArray();
 * 
 * for (int i = 0; i < arr.length; i++) { char ch = arr[i]; if
 * (!map.containsKey(ch)) { map.put(ch, i); } else { i = map.get(ch);
 * map.clear(); } if (map.size() > longestSubStringLength) {
 * longestSubStringLength = map.size(); longestSubString =
 * map.keySet().toString(); } } System.out.println("The Longest SubString is : "
 * + longestSubString); System.out.println("The Longest Substring Length is : "
 * + longestSubStringLength); } }
 * 
 * 
 * Output: The Longest SubString is : [w, o, r, l, d] The Longest Substring
 * Length is : 5
 **********************************************************************************************************************************
 * 
 * 
 * //sample java code String[] str =
 * {'aabchd','aabchk','aabckj','aabdh','aabchl'}; to find out common string in
 * string[] package com.corejava.chatgpt;
 * 
 * public class CommonStringInArray { public static void main(String[] args) {
 * String[] str = { "aabchd", "aabchk", "aabkj", "aabcdh", "aabchl" };
 * 
 * // Assuming first string as common string String commonString = str[0];
 * 
 * // Iterate through the array and compare each string with the first string
 * for (int i = 1; i < str.length; i++) { String currentString = str[i]; int j =
 * 0;
 * 
 * // Compare each character of the strings while (j < commonString.length() &&
 * j < currentString.length()) { if (commonString.charAt(j) !=
 * currentString.charAt(j)) { break; } j++; }
 * 
 * // If the current string is not common with the previous common string,
 * update // the common string commonString = commonString.substring(0, j);
 * 
 * // If no common characters are found, break the loop if
 * (commonString.isEmpty()) { break; } }
 * 
 * System.out.println("Common string :: " + commonString); } }
 * 
 * Output: Common string :: aab
 **********************************************************************************************************************************
 * 
 * 
 * package com.corejava.chatgpt;
 * 
 * Given a list of integers, find out all the numbers starting with 1 using
 * Stream functions? Input : {23, 34, 45, 56, 122, 43, 101, 67, 11, 98, 10},
 * Output : {10, 11, 101, 122}
 * 
 * 
 * import java.util.Arrays; import java.util.List; import
 * java.util.stream.Collectors;
 * 
 * public class Main { public static void main(String[] args) { List<Integer>
 * numbers = Arrays.asList(23, 34, 45, 56, 122, 43, 101, 67, 11, 98, 10);
 * 
 * // Filter numbers starting with 1 List<Integer> result = numbers.stream()
 * .filter(n -> String.valueOf(n).startsWith("1"))
 * .collect(Collectors.toList());
 * 
 * // Print the result System.out.println(result); } }
 * 
 * Output:- [122, 101, 11, 10]
 **********************************************************************************************************************************
 * 
 * 
 * //Company :: ADP
 * 
 * 
 * Write a program in java 3956789 => 3+9+5+6+7+8+9 = 47 47 => 4+7 = 11 11 =>
 * 1+1 = 2 Ans:- 2
 * 
 * package com.corejava.iq; public class NumberConverter { public static void
 * main(String[] args) { int number = 3956789;
 * 
 * while (number > 9) { int sum = 0; while (number > 0) { int digit = number %
 * 10; sum += digit; number /= 10; } number = sum; }
 * 
 * System.out.println("Result :: " + number); } }
 * 
 * 
 * 
 * 
 * 
 * package com.corejava.iq; import java.util.Scanner;
 * 
 * public class DigitalRootCalculator { public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Enter a number :: "); int number = scanner.nextInt();
 * 
 * int digitalRoot = calculateDigitalRoot(number);
 * System.out.println("Digital Root :: " + digitalRoot); }
 * 
 * public static int calculateDigitalRoot(int number) { while (number > 9) { int
 * sum = 0; while (number != 0) { sum += number % 10; number /= 10; } number =
 * sum; } return number; } }
 * 
 */

/**************************************************************************************************/


//Sure! Here's a program in Java that adds x and y without using a third variable:

/*
 * public class AdditionWithoutThirdVariable { public static void main(String[]
 * args) { int x = 10; int y = 20;
 * 
 * // Adding x and y without using a third variable x = x + y;
 * 
 * System.out.println("The sum is: " + x); } }
 */

/*In this program, we add the values of x and y by directly assigning the sum to x itself. The sum is then printed as output.*/


/**************************************************************************************************/

