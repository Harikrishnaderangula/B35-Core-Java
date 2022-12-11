package Exceptiondemo;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     int x=14;
	     System.out.println("Enter the value of y");
	     int y=s.nextInt();
	     try {
	     
	    
	     int result=x/y;
	     System.out.println(result);
	     
	     
	  }
	     catch(ArithmeticException e)
	     {
	    	 System.out.println("Exception Handle"+e);
	     }
	}

}
