package usecases;

import java.util.Scanner;

import Dao.DaoEmployee;
import Dao.DaoEmployeeImpl;

public class GetEmployeeByid {
public static void getemployeebyid() {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter eid to get employee");
		int eid=sc.nextInt();
		DaoEmployee emp=new DaoEmployeeImpl();
		System.out.println(emp.getEmployeeById(eid));
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
