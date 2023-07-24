package com.example.demo;

class ParentClass
{
	 void print(){
		System.out.println("parent class");
	}
}
public class SubClass extends ParentClass{
	 void print(){
		System.out.println("sub class");
	}
	
	public static void main(String[] args) {
		//SubClass obj1 = new SubClass();
		ParentClass obj1 = new ParentClass();
		ParentClass obj2 = new SubClass();
		SubClass obj3 = new SubClass();
		obj1.print();
		obj2.print();
		obj3.print();
	}
}

