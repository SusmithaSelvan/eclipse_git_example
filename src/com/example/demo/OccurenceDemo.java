package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class OccurenceDemo {

	public static void main(String[] args) {
		String str="abbccc";
		char charArray[] = str.toCharArray();
		
		Map<Character,Integer> value= new HashMap<Character,Integer>();
		
		for(char c : charArray)
		{
			if(value.containsKey(c))
			{
				value.put(c, value.get(c)+1);
			}
			else
			{
				value.put(c,1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:value.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
