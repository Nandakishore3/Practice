package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		//Variable Declaration
		String name;
		int score=0, ans;
		Scanner obj = new Scanner(System.in);
		
		//Read from User
		System.out.println("Enter your name: ");
		name = obj.nextLine();
				
		System.out.println("==================================");
		System.out.println("Hi "+name+",Welcome to Quiz");
		System.out.println("==================================");
		
		System.out.println("Q1: Who is the Prime Misnister of India?");
		System.out.println("1.Narendra Modi 2.Arvind Kejrival 3. KCR");
		System.out.println("Enter your choice");
		ans=obj.nextInt();
		if (ans==1)
			score = score+20;
		
		
		System.out.println("Q2: Which is the largest planet in the solar system?");
		System.out.println("1. Earth 2. Jupiter 3. Mars");
		System.out.println("Enter your choice");
		ans=obj.nextInt();
		if (ans==2)
			score = score+20;
		
		
		System.out.println("Q3: Which is the largest continent?");
		System.out.println("1. China 2. Australia 3. Asia");
		System.out.println("Enter your choice");
		ans=obj.nextInt();
		if (ans==3)
			score = score+20;
		
		
		System.out.println("Q4: What is the name of the longest river in the world?");
		System.out.println("1. The Nile 2. The Ganga 3. The Mediterian");
		System.out.println("Enter your choice");
		ans=obj.nextInt();
		if (ans==1)
			score = score+20;
		
		
		System.out.println("Q5: In java what is the biggest number that can be stored in 1byte of memory?");
		System.out.println("1. 128 2. 127 3. 255");
		System.out.println("Enter your choice");
		ans=obj.nextInt();
		if (ans==2)
			score = score+20;
		
		
		if (score>=60)
			System.out.println("Hi "+name+",You are passed with " +score);
		else
			System.out.println("Sorry "+name+",You got only " +score);
			obj.next();
					
		
	}

}
