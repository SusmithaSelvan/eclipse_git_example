package com.example.demo;

public class PatternExample1 {
	/*	*
	 	**
	 	***
	 	****
	 	*****
	 */
	public static void main(String[] args) {
		int num = 5;
		
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(" "); }
		 */
		 
		
		
		/*
		 * for(int i=1;i<=num;i++) { for(int j=1;j<=5;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 */
		 
		
		
		/*
		 * for(int i=5;i>=0;i--) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.print("\n"); }
		 */
		 
		
		
		/*
		 * for(int i=1;i<=num;i++) { for(int j=1;j<=i;j++) { System.out.print(j+" "); }
		 * System.out.println(""); }
		 */
		 
		
		
		/*
		 * for(int i=1;i<=num;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(""); } for(int i=num-1;i>0;i--) { for(int j=1;j<=i;j++) {
		 * System.out.print("*"); } System.out.println(""); }
		 */
		 
		
		
		/*
		 * for(int i=1;i<=num;i++) { for(int j=5;j>i;j--) { System.out.print(" "); }
		 * for(int k=1;k<=i;k++) { System.out.print("*"); } System.out.println(""); }
		 */
		 
		
		/*
		 * for(int i=0;i<num;i++) { for(int j=1;j<2+i-1;j++) { System.out.print(" "); }
		 * for(int k=1;k<=num-i;k++) { System.out.print("*"); } System.out.println("");
		 * }
		 */
		
		/*
		 * for(int i=0;i<num;i++) { for(int j=1;j<=2*i+1;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 */
		
		/*
		 * for(int i=0;i<num;i++) { for(int j=1;j<num-i;j++) { System.out.print(" "); }
		 * for(int k=1;k<=2*i+1;k++) { System.out.print("*"); } System.out.println("");
		 * } for(int l=4;l>0;l--) { for(int k=0;k<num-l;k++) { System.out.print(" "); }
		 * for(int j=1;j<=2*l-1;j++) { System.out.print("*"); }
		 * 
		 * System.out.println(""); }
		 */
		
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
