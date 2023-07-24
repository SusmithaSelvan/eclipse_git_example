package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
//input : [1,2,3,4,4,1,2]
//output : [1,2,3,4]
	public static void main(String[] args) {
		
		/*
		 * int arr[] = {1,2,3,4,4,1,2}; Set<Integer> value = new HashSet<Integer>();
		 * for(int i:arr) { value.add(i); } System.out.println(value);
		 */
		
		List<Integer> value = Arrays.asList(1,2,3,4,4,1,2);
		value.stream().distinct().forEach(System.out::println);
	}
	
}
