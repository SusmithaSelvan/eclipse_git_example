package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pairs 
{
	public int compare(Integer a, Integer b) {

		return a % 10 > b % 10 ? 1 : -1;
	}
	
}

public class ComparableExample{
	public static void main(String[] args) {
		List<Integer> value = Arrays.asList(35, 11,20, 24,22,75,89);
		Collections.sort(value);
		System.out.println(value);
	}	
}