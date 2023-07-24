package com.example.demo;

interface ClassA{
	//public void draw();
	//public int add(int a,int b);
	public void print();
}
public class LambdaExpression {
	public static void display()
	{
		System.out.println("display method");
	}
	public static void main(String[] args) {
		/*
		 * ClassA obj = () -> { System.out.println("draw method"); };
		 * 
		 * ClassA obj1 = () -> System.out.println("draw method"); obj.draw();
		 * obj1.draw();
		 */
		
		/*
		 * ClassA obj = (a,b) -> a+b; System.out.println(obj.add(10, 5));
		 */
		
		ClassA obj1 = LambdaExpression::display;
		obj1.print();
	}
}
