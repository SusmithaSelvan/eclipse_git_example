package com.example.demo.practise;

class PlusMinus {
	public static void main(String args[]) {
		int n = 24;
        while(n>0)
        {
            if(n%2!=0)
            {
                System.out.println("Weird");
                break;
            }
            else if(n >=2 && n<=5)
            {
                System.out.println("Not Weird");
                break;
            }
            else if(n >=6 && n<=20)
            {
                System.out.println("Weird");
                break;
            }
            else if(n>20)
            {
                System.out.println("Not Weird");
                break;
            }
        }

	}
}
