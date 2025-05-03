package com.practice;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks to know the grade of the student");
		int i;
		while(true)
		{
			i=sc.nextInt();
			if (i==0)
			{
				System.out.println("Exiting");
				break;
			}
			if (i>90)
			{
				System.out.println("Grade A");
			}
			else if (i>=75 && i<=90)
			{
				System.out.println("Grade B");

			}
			else if (i>=60 && i<75)
			{
				System.out.println("Grade C");

			}
			else if (i>=50 && i<60)
			{
				System.out.println("Grade D");
			}
			else
			{
				System.out.println("Fail");
			}
			System.out.println("Enter 0 to exit");
		}
		
	}

}
