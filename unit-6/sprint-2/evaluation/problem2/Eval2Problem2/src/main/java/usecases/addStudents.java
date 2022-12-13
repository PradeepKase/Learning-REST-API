package usecases;

import java.util.ArrayList;
import java.util.Scanner;

import Dao.DAOImpl;
import Dao.DAOInt;
import beans.Student;



public class addStudents {
public static void Addsudents(Scanner sc) {
	System.out.println("Enter Student Name :");
	String name = sc.nextLine();
	
	System.out.println("Enter email :");
	String email = sc.next();
	
	System.out.println("Enter roll no :");
	int roll_no=sc.nextInt();
	
	System.out.println("Enter moble no :");
	String mobile = sc.next();
	
	System.out.println("Enter course id :");
	int courseid=sc.nextInt();
	
	Student d = new Student();

	
//	DAOInt dao = new DAOImpl(roll_no,name,email,mobile,courseid);

	
	System.out.println("Department Added Successfully !");
}
}
