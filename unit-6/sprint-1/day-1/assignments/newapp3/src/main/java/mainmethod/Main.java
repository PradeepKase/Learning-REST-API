package mainmethod;

import Exceptions.EmployeeException;
import Usecases.AddEmployee;
import Usecases.GetEmployee;

public class Main {
	public static void main(String[] args) throws EmployeeException {
		//AddEmployee.registerEmployee();
		GetEmployee.getEmployeeById();
	}
}
