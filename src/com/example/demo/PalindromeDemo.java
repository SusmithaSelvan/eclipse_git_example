package com.example.demo;

public class PalindromeDemo {
	public static void main(String[] args) {
		String s = "acba";
		String reverseString = "";
		for(int i=s.length();i>0;i--)
		{
			reverseString = reverseString+s.charAt(i-1);
		}
		if(s.equals(reverseString))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
