package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;

class Pair implements Comparable<Pair> {
	int rollno;
	String name;
	int age;

	Pair(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Pair st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
	
	public int compareToRollNo(Pair sts) {
		if (rollno == sts.rollno)
			return 0;
		else if (rollno > sts.rollno)
			return 1;
		else
			return -1;
	}
	
}

public class Demo {
	public static void main(String[] args) {

		ArrayList<Pair> al=new ArrayList<Pair>();  
		al.add(new Pair(101,"Vijay",23));  
		al.add(new Pair(106,"Ajay",27));  
		al.add(new Pair(105,"Jai",21));  
		  
		Collections.sort(al);  
		// printing the
		// Pair array
		for(Pair st:al){  
			System.out.println("compare by age: " + st.rollno+" "+st.name+" "+st.age);  
			}
		
		System.out.println("\n");
		
		for(Pair sts:al){  
			System.out.println("compare by rollno: " + sts.rollno+" "+sts.name+" "+sts.age);  
			}
	}
}
