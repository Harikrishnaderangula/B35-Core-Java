package org.tnsindia.datatype;

import java.util.Scanner;

public class ByteDataTypeDemoJava {

	public static void main(String[] args) {
		//@SuppressWarnigs("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=s.nextInt();
		System.out.println("Enter the number: ");
		
		float y=s.nextFloat();
		System.out.println("Enter the char: ");
		
		char c=s.next().charAt(0);
		System.out.println("Enter the Strings: ");
		
		String str=s.next();
		//String strl=s.nextLine();
		
		System.out.println("The integer is: "+x);
		System.out.println("The desimal is: "+y);
		System.out.println("The characte is: "+c);
		System.out.println("The string is; "+str);
		s.close();

	}

}
