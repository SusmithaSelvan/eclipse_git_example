package com.example.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CollectionsExample {
	public static void main(String[] args) {
		
		//arraylist
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		list.remove(4);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//stack
		System.out.println("\nstack:");
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		for(int i=0;i<stack.size();i++)
		{
			System.out.println(stack.get(i));
		}
		
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
		for(Integer i : stack)
		{
			System.out.print("\n"+i);
		}
	}
}
