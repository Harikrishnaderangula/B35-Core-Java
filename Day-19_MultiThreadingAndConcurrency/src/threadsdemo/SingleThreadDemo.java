package threadsdemo;

class Parent
{
	public void squarenum() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("Squares of the num"+(i*i));
		}
	}
	
}
class Child
{
	public void doubleNum() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("Squares of the num"+(i*2));
	}
}
}

public class SingleThreadDemo {

	public  static void main(String[] args) throws InterruptedException {

		System.out.println("Main method.....");
		Parent p=new Parent();
		Child c=new Child();
		p.squarenum();
		c.doubleNum();
		

	}

}
