package com.practice;

import java.util.Scanner;

public class TypeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a==b && b==c)
		{
			System.out.println("Its an equilateral triangle");
		}
		else if (a==b && b!=c || a==c && c!=b || b==c && c!=a)
		{
			System.out.println("Its an Isosles triangle");
		}
		else
		{
			System.out.println("Scalane triangle");
		}

	}

}
