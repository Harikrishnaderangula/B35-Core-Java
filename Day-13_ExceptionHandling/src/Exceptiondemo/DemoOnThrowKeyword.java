package Exceptiondemo;

public class DemoOnThrowKeyword {
	//private data member
	private String contents;



	//method
	public void display(String contents)
	{
		this.contents=contents;
		if(contents.isEmpty())
		{
			throw new NullPointerException("Content is Empty");
		}
		else
		{
			System.out.println("Contents are: "+contents);
		}
	}

}
