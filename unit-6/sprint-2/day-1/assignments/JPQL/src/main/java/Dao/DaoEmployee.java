package Dao;

import Exceptions.EmployeeException;
import beans.Employee;

public interface DaoEmployee {
	public Employee updateEmployee(Employee employee)throws EmployeeException;
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public void getEmployeenames();
	public Employee registerEmployee(Employee employee)throws EmployeeException;
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
}
