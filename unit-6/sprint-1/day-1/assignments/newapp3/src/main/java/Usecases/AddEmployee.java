package Usecases;

import java.util.Scanner;

import EmployeeDao.EmployeeInterface;
import EmployeeDaoImpl.EmployeeImpl;
import Exceptions.EmployeeException;
import sprint1class1unit6.Employee;

public class AddEmployee {
public static void registerEmployee() throws EmployeeException {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter emplyeeId");
	int eid=sc.nextInt();
	System.out.println("enter emplyee name");
	String name=sc.next();
	System.out.println("enter emplyee address");
	String address=sc.next();
	System.out.println("enter emplyee salary");
	int salary=sc.nextInt();
	Employee emp=new Employee(eid,name,address,salary);
	
	EmployeeInterface e1= new EmployeeImpl();
	
	
	System.out.println(e1.registerEmployee(emp));
	
}



}
