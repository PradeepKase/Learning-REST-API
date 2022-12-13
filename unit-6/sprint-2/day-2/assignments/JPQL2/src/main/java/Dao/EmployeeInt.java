package Dao;

import java.util.List;

import Exception.EmployeeException;
import beans.Employee;

public interface EmployeeInt {
	public void RegisterEmployees();
	public List<Employee> getAllEmployees() throws EmployeeException;

}
