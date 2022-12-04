package interfacedemo;

import java.util.Scanner;
//Implementable class for the Interface
public class Shape implements Area {

	@Override
	public void rectangle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the recangle");
		int length=s.nextInt();
		int breadth=s.nextInt();
		System.out.println("The areaof the rectangle is: "+(length*breadth));
		//s.close();
	}

	@Override
	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int radius=s.nextInt();
		System.out.println("The areaof the  circle is: "+(3.14*radius*radius));
		s.close();
	}

}
