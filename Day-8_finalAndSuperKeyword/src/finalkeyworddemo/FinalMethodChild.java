package finalkeyworddemo;

public class FinalMethodChild {
	public String PAN_no;

	/*if we use final keyword with method then method override is not
	 * possible
	 * 
	 */
	
	
	//method overriding
	/*public void print()
	{
		System.out.println("PAN no.is: "+PAN_no);
		super.print();
	}*/
	

	//method overloading
	public void print(String PAN_NO)
	{
		System.out.println("PAN no.is: "+PAN_no);
	}

}
