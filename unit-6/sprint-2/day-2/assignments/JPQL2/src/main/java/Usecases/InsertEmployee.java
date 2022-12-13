package Usecases;

import java.util.List;


import Dao.EmployeeImpl;
import Dao.EmployeeInt;
import Exception.EmployeeException;
import beans.Employee;

public class InsertEmployee {

	public static void addemployee() throws EmployeeException{
		EmployeeInt dao=new EmployeeImpl();
		dao.RegisterEmployees();	
//		System.out.println(s);
	}
	
}
