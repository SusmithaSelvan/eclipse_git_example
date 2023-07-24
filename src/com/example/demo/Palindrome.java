package com.example.demo;

public class Palindrome {
	// level
	public static void main(String[] args) {
		/*
		 * String str="abcb"; int counter=0; char a[] = str.toCharArray();
		 * System.out.println(a.length); for(int i=0;i<a.length;i++) {
		 * if(a[i]==a[a.length-1]) { counter++; } } if(counter>1) {
		 * System.out.println("palindrome"); } else {
		 * System.out.println("not a palindrome"); }
		 */
		String str="abcb";
		String value="";
		for(int i=str.length();i>0;i--)
		{
			value=value+str.charAt(i-1);
		}
		if(str.equals(value))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		StringBuffer sb = new StringBuffer(str);
		String value1 = String.valueOf(sb.reverse());
		System.out.println(value1);
		if(sb.equals(value1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
