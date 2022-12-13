package usecases;

import java.util.Scanner;

import Dao.DaoEmployee;
import Dao.DaoEmployeeImpl;
import beans.Employee;

public class AddEmployeeUsecase {
	public static void addemployee(){
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the employee eid");
			int eid=sc.nextInt();
			System.out.println("enter the employee name");
			String name=sc.next();
			System.out.println("enter the employee salary");
			int salary=sc.nextInt();
			System.out.println("enter the employee deg");
			String deg=sc.next();
			DaoEmployee dao=new DaoEmployeeImpl();
			Employee s= dao.updateEmployee(new Employee(eid,name,salary,deg));	
			System.out.println(s);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
