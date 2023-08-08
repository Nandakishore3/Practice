package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		int n,i;
		Scanner obj = new Scanner(System.in);
				
		System.out.println("Enter your number: ");
		n = obj.nextInt();
		
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
				break;
		}
		
		{
			if(i==n)
			System.out.println("Prime Number");
			else
				System.out.println("Not Prime Number");
		}
				
		}
		
		
	}
