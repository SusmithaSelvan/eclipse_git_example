package com.example.demo;

class SingletonDemo {
	public static void main(String args[])
	{
		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		System.out.println("Hashcode of x is "
						+ x.hashCode());
		System.out.println("Hashcode of y is "
						+ y.hashCode());
		System.out.println("Hashcode of z is "
						+ z.hashCode());
	}
}

class Singleton{
		//Lazy intialization
		/*
		 * Object is created only if it is needed. It may overcome wastage of resource and CPU time. 
		 * Exception handling is also possible in method. 
		 * Every time a condition of null has to be checked. instance can’t be accessed directly. 
		 * In multithreaded environment, it may break singleton property.
		 */
		private static Singleton single_instance = null;

		private Singleton()
		{
			System.out.println("constructor");
		}
		public static Singleton getInstance()
		{
			  if (single_instance == null) 
				  single_instance = new Singleton();
			 
			return single_instance;
		}
	}
