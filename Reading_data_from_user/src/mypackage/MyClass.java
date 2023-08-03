package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		//Variable Declaration
		Scanner obj = new Scanner (System.in);
		
		String name;
		int age;
		float salary;
		
		//Read data from user
		System.out.println("Enter your name: ");
		name = obj.nextLine();
		System.out.println("Enter your age: ");
		age = obj.nextInt();
		System.out.println("Enter ypur salary: ");
		salary = obj.nextFloat();
		
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
				

	}

}
