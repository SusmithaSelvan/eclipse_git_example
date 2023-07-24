package com.example.demo;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		//try(Scanner sc=new Scanner(System.in))
		try
		{
			int a=sc.nextInt();
			System.out.println(a/5);
		}
		finally {
			System.out.println("finally block");
		}
		
	}
}
