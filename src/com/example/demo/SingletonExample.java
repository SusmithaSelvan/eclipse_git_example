package com.example.demo;

public class SingletonExample {
	public static void main(String[] args) {
		Abc obj1 = Abc.getInstanc();
		System.out.println(obj1);
		Abc obj2 = Abc.getInstanc();
		System.out.println(obj2);
	}
}

class Abc{
	//Early initialization
	/*
	 * Very simple to implement. 
	 * May lead to resource wastage. Because instance of class is created always, whether it is required or not. 
	 * CPU time is also wasted in creation of instance if it is not required. 
	 * Exception handling is not possible.
	 */
	static Abc obj=new Abc();
	private Abc()
	{
		System.out.println("constructor");
	}
	public static Abc getInstanc()
	{
		return obj;
	}
}