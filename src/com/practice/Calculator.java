package com.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number and arthematic operator choice");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		if ( c.equals("+"))
		{
			System.out.println("Addition of a and b"+ "=" + (a+b));
		}
		else if (c.equals("-"))
		{
			System.out.println("Difference of a and b"+ "=" + (a-b));
		}
		else if (c.equals("/"))
		{
			if (b==0)
			{
				System.out.println("Ivalid denomenator");
			}
			else
			{
			System.out.println("Divident of a and b"+ "=" + (a/b));
			}
		}
		
	}

}
