package com.edu;

import java.util.Scanner;

public class UserInputMain {

	public static void main(String[] args) {
		int age;
		String name;
		float fees;
		char gender;
		 Scanner sc=new Scanner(System.in);
		
		 //user input
		 System.out.println("Enter the name:");
		 name=sc.next();
		 System.out.println("Enter the age:");
		 age=sc.nextInt();
		 System.out.println("Enter the fees:");
		 fees=sc.nextFloat();
		 System.out.println("Enter the gender M/F:");
		 gender=sc.next().charAt(0);
		 
		 //Display
		 System.out.println("name="+name);
		 System.out.println("age="+age);
		 System.out.println("fees="+fees);
		 System.out.println("gender="+gender);

	}

}
