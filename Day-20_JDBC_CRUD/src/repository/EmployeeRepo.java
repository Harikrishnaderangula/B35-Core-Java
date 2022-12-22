package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import entities.Employee;

public interface EmployeeRepo {

	Statement createStatement();
	PreparedStatement createPrepareStatement(String query);
	public ResultSet retreive(String Query);
	public int add(String query, Employee emp);
	public int update(String query, Employee emp);
	public int delete(String query);
}
