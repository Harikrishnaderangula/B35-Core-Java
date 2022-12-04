package interfacedemo;

/*/public class Employee implements Manager {

	@Override
	public void salaryDiscussion() {
		System.out.println("About Basic and varaible Play");
		
	}

	@Override
	public void projectDiscussion() {
		System.out.println("About the java project");
		
	}
}*/
public class Employee implements HR,Manager{

	@Override
	public void projectDiscussion() {
		System.out.println("About the java project");
		
	}

	@Override
	public void salaryDiscussion() {
		System.out.println("About Basic and varaible Play");
		
	}
	
}