package usecases;

import java.util.Scanner;

import Dao.DaoEmployee;
import Dao.DaoEmployeeImpl;
import beans.Employee;

public class Getemployeenames {
public static void getEmployeenames() {
	Scanner sc=new Scanner(System.in);
	try {
//
//		System.out.println("enter the employee eid");
//		int eid=sc.nextInt();
		DaoEmployee dao=new DaoEmployeeImpl();
		 dao.getEmployeenames();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
