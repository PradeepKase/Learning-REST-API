package usecases;

import java.util.Scanner;

import Dao.DaoEmployee;
import Dao.DaoEmployeeImpl;

public class DeletEmployee {
public static void deletemployeeByid() {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter eid to delet employee");
		int eid=sc.nextInt();
		DaoEmployee emp=new DaoEmployeeImpl();
		System.out.println(emp.deleteEmployeeById(eid));
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
