package org.tnsindia.operatorsDemo;

import java.util.Scanner;

public class ArthimaticOperoterDemo {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("The addition is: "+(a+b));
		System.out.println("The addition is: "+(a-b));
		System.out.println("The addition is: "+(a*b));
		System.out.println("The addition is: "+(a/b));
		System.out.println("The addition is: "+(a%b));
		s.close();

	}

}
