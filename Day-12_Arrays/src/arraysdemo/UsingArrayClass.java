package arraysdemo;

import java.util.Arrays;

public class UsingArrayClass {

	public static void display(int ...a) {
		//sort method is in arrays class which is used to sort the values
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	public static void main(String[]args) {
		display(11,23,15,97,67,1,2,4);
	}

}
