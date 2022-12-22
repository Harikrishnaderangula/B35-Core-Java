package entities;

public class Employee {
	
	//private data members
	private int ID;
	private String NAME;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int iD, String nAME) {
		super();
		ID = iD;
		NAME = nAME;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", NAME=" + NAME + "]";
	}
	
	

}
