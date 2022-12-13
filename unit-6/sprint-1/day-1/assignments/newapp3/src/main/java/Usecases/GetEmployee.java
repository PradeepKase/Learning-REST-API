package Usecases;

import java.util.Scanner;

import EmployeeDao.EmployeeInterface;
import EmployeeDaoImpl.EmployeeImpl;
import Exceptions.EmployeeException;
import sprint1class1unit6.Employee;

public class GetEmployee {
public static void getEmployeeById() throws EmployeeException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter emplyeeId");
	int eid=sc.nextInt();
	EmployeeInterface dao = new EmployeeImpl();
	
	Employee employee= dao.getEmployeeById(eid);
	
	if(employee != null)
		System.out.println(employee);
	else
		System.out.println("Student does not exist with Roll :"+eid);
}
}
