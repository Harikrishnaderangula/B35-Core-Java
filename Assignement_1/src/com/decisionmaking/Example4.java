package com.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// switch
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Akhila");
		case 2:
			System.out.println("Hello");
		case 3:
			System.out.println("Rita");
			break;
			default:
				System.out.println("Invalid input");
		}

	}

}
