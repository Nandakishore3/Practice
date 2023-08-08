package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		
		int n;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		n = obj.nextInt();
		
		if(n%2==0)
			System.out.println("Even Number");
		else 
			System.out.println("Odd Number");
		
			}

}
