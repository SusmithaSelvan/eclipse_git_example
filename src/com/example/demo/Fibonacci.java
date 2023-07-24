package com.example.demo;

public class Fibonacci {
	// 0 1 1 2 3 5
	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=4;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<count;i++)
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}
}
