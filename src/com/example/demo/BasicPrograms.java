package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class BasicPrograms {
	public static void main(String[] args) {
		/*
		 * int a = 50, b = 30, c = 20; if (a <= b) { if (b <= c) {
		 * System.out.println("c is higher"); } else {
		 * System.out.println("b is higher"); } } else {
		 * System.out.println("a is higher"); }
		 */

		Map<Integer, Integer> list = new HashMap<Integer, Integer>();
		// System.out.println(Collections.max(list));
		list.put(1, 40);
		list.put(2, 50);
		list.put(3, 40);
		list.put(4, 60);
		list.put(5, 40);
		list.put(6, 70);
		/*
		 * Iterator<Integer> itr = list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		for (Map.Entry<Integer, Integer> e : list.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

		try {
			perform();
		} catch (Exception e) {
			System.out.println("catch block"+ e.getMessage());
			throw new ArithmeticException();
		}
	}

	static void perform() {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
