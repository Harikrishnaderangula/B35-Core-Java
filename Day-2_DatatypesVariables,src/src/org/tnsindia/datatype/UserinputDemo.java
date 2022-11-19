package org.tnsindia.datatype;

import java.util.Scanner;

public class UserinputDemo {

	public static void main(String[] args) {
		//@SuppressWarnigs("resource")
			Scanner s=new Scanner(System.in);
				
			System.out.println("Enter the Strings: ");
			String str=s.nextLine();
			String strl=s.next();	
			System.out.println("The output is: ");
			
			
			System.out.println("The String is: "+str);
			System.out.println("The String is; "+str);
			s.close();

	}

}
