package com.example.demo.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class JavaPrograms {
	public static void main(String[] args) {

		System.out.println("Occurence of a number");

		int array[] = { 5, 4, 6, 3, 1, 3, 2 };
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {
				hashMap.put(array[i], hashMap.get(i) + 1);
			} else {
				hashMap.put(array[i], 1);
			}
		}
		System.out.println(hashMap);

		List<Integer> list = Arrays.asList(5, 4, 6, 3, 1, 3, 2);

		System.out.println(list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())));

		int array1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int array2[] = { 1, 2, 3, 4 };
		int count = 0;

		Set<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0, j = 0; i < array1.length || j < array2.length; i++, j++) {
			hashSet.add(array1[i]);
			hashSet.add(array1[j]);
			count++;
		}
		System.out.println("Unique numbers count : " + count);

		String str = "Help others";

		String replacedString = str.replaceAll(" ", "");
		StringBuilder sb = new StringBuilder(replacedString).reverse();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.insert(i, ' ');
			}
		}
		System.out.println(sb);

		int array3[] = { 3, 1, 2, 4, 5, 9, 13, 14, 12 };

		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();

		for (int i = 0; i < array3.length; i++) {
			if (i % 2 == 0) {
				evenList.add(array3[i]);
			} else {
				oddList.add(array3[i]);
			}
		}

		Collections.sort(evenList);
		Collections.sort(oddList, Collections.reverseOrder());

		System.out.println("\nevenArray: " + evenList);
		System.out.println("oddArray: " + oddList);

		for (int i = 0; i < evenList.size(); i++) {
			System.out.print(evenList.get(i) + " ");
		}
		for (int i = 0; i < oddList.size(); i++) {
			System.out.print(oddList.get(i) + " ");
		}

		String strValue = "A&B#CD";
		String replacedString1 = strValue.replaceAll("[&#]", "");
		StringBuilder sb1 = new StringBuilder(replacedString1).reverse();

		for (int i = 0; i < strValue.length(); i++) {
			if (strValue.charAt(i) == '&') {
				sb1.insert(i, '&');
			} else if (strValue.charAt(i) == '#') {
				sb1.insert(i, '#');
			}
		}
		System.out.println("\n" + sb1);

		String strValue1 = "geeksforgeeks";
		String strValue2 = "forgeeksgeeks";

		char ch1[] = strValue1.toCharArray();
		char ch2[] = strValue2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("The given string is anagram");
		} else {
			System.out.println("The given string is not anagram");
		}

		String paranthesis = "[()]{}{[()()]()}";

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < paranthesis.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(paranthesis.charAt(i));
			} else if (paranthesis.charAt(i) == '[' || paranthesis.charAt(i) == '(' || paranthesis.charAt(i) == '{') {
				stack.push(paranthesis.charAt(i));
			} else if (paranthesis.charAt(i) == ']' && stack.peek().equals('[')) {
				stack.pop();
			} else if (paranthesis.charAt(i) == ')' && stack.peek().equals('(')) {
				stack.pop();
			} else if (paranthesis.charAt(i) == '}' && stack.peek().equals('{')) {
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String strToReverse = "i.like.this.code.very.much";
		
		String strResultArr[] = strToReverse.split("[.]");
		String result = "";
		for(int i=strResultArr.length-1;i>=0;i--)
		{
			result = result + "." + strResultArr[i];
		}
		System.out.println(result.substring(1));
		
		List<Integer> list1 = Arrays.asList(3,5,6,1,2,4);
		
		System.out.println(list1.stream().findFirst().get());
		
		System.out.print("ArrayList: " + list1);
        // find first element
        int first = list1.get(0);
        // find last element
        int last = list1.get(list1.size() - 1);
        // print first and last element of ArrayList
        System.out.println("\nFirst : " + first
                           + ", Last : " + last);
		System.out.println(list1.stream().sorted(Collections.reverseOrder()).findFirst().get());
		System.out.println("second max: "+ list1.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
		
		System.out.println("max no: " +Collections.max(list1));
		System.out.println("min no: " +Collections.min(list1));
		
		String strValue3 = "abbccc";
		System.out.println(Arrays.stream(strValue3.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));
	

		String strnew = "Java Programming";
        String strnew1 = "Programmingg";
  
        if (strnew.regionMatches(5, strnew1, 0, 11))
            System.out.println("Same");
        else
        	System.out.println("Not Same");
        
        String strUnderscore = "example_string_";
        strUnderscore = strUnderscore.replaceAll("_+$", ""); // replaces underscore at end of string with empty string
        System.out.println(strUnderscore); // prints "example_string"

	}
}
