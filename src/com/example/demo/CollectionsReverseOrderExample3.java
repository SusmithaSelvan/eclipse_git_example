package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseOrderExample3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Jaya", "Pratham", "Ruby", "Commit");  
        Collections.sort(list, Collections.reverseOrder (CollectionsReverseOrderExample3::lastCharComparator));  
        //Sort the list according to last character of word and return comparator for reverse order  
        System.out.println(list);  
        }  
    private static int lastCharComparator(String s1, String s2) {  
        return Character.compare(s1.charAt(0), s2.charAt(0));  
	}
}
