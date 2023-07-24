package com.example.demo.practise;

public class ReverseProgram {
	public static void main(String[] args) {
		int number = 1234;
		int reverse=0,remainder=0;
		
		while(number!=0)
		{
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
		}
		System.out.println(reverse);
		
		int num = 5;
		int square = num * num;
		while (num > 0) {
			if (num % 10 != square % 10)
				System.out.println(false);
			num = num / 10;
			square = square / 10;
		}
		System.out.println(true);
	}
}
