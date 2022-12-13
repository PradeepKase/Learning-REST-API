package Usecases;

import Dao.EmployeeImpl;
import Dao.EmployeeInt;
import Exception.EmployeeException;

public class GetAllEmployee {
public static void GetAllemployee() throws EmployeeException {
	EmployeeInt e1=new EmployeeImpl();
	System.out.println( e1.getAllEmployees());
}
}