package usecases;

import java.util.Scanner;

import Dao.DaoEmployee;
import Dao.DaoEmployeeImpl;
import beans.Employee;

public class RegisterEmployeeusecase {
	public static void RegisterEmployee(){
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the employee name");
			String name=sc.next();
			System.out.println("enter the employee salary");
			int salary=sc.nextInt();
			System.out.println("enter the employee deg");
			String deg=sc.next();
			DaoEmployee dao=new DaoEmployeeImpl();
			Employee s= dao.registerEmployee(new Employee(name,salary,deg));	
			System.out.println(s);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
}
}