package EmployeeDao;

import Exceptions.EmployeeException;
import sprint1class1unit6.Employee;

public interface EmployeeInterface {
	public String registerEmployee(Employee employee)throws EmployeeException;
	public Employee getEmployeeById(int empId)throws EmployeeException;
}
