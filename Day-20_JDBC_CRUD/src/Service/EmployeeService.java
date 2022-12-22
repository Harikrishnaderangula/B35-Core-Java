package Service;

import java.util.List;

import entities.Employee;

public interface EmployeeService {

	//by default all the method are abstract in an interface
	
	//CRUD user defind method
	public  boolean AddEmployee(Employee emp);
	public Employee UpdateEmployee(Employee emp);
	public boolean DeletEmployee(int ID);
	public Employee GetEmployee(int ID);
	public List<Employee> GetAll();
}
