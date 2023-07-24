package com.example.demo;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String value[] = new String[5];
		value[2] = "hello world";
		Optional<String> data = Optional.ofNullable(value[3]);
		if(data.isPresent())
		{
			System.out.println("1. "+data.toString());
			System.out.println("2. "+data.get());
		}
		else
		{
			System.out.println("1. "+"its empty");
			System.out.println("2. "+data.toString());
			System.out.println("3. "+data.isPresent());
			System.out.println("4. "+data.isEmpty());
			System.out.println("5. "+data.hashCode());
			System.out.println("6. "+data.getClass());
			System.out.println("7. "+data.empty());
			System.out.println("8. "+data.of(value[2]));
			System.out.println("9. "+data.orElseThrow());
		}
	}
}
