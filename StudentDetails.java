package com.edu;
		import java.util.Scanner;
		class Student{
			int sid;
			float sfees;
			String sname;
			
			void acceptData() {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the sname");
				sname=sc.next();
				System.out.println("enter the sid");
				sid=sc.nextInt();
				System.out.println("enter the sfees");
				sfees=sc.nextFloat();
			}
			void display() {
				System.out.println("name="+sname);
				System.out.println("id="+sid);
				System.out.println("fees="+sfees);
			}
		}

		public class StudentDetails {
			public static void main(String[] args) {
				Student sob1=new Student();
				Student sob2=new Student();
				sob1.acceptData();
				sob2.acceptData();
				sob1.display();
				sob2.display();
				
				
			}
			}

