package com.ntt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
	 Scanner s = new Scanner(System.in);
	  System.out.print("Enter ur name :: ");
	  String name = s.nextLine();
	  System.out.print("Enter ur age :: ");
	  int age = s.nextInt();

	System.out.println("The name is - "+ name);
	System.out.println("The age is - "+ age);
	}
}