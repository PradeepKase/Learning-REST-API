package usecases;

import java.util.Scanner;

import Dao.DAOImpl;
import Dao.DAOInt;

public class getCourse {
public static void getcourse() throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter course id");
	int courseid =sc.nextInt();
	
	DAOInt dao=new DAOImpl();
	dao.getCourse(courseid);
	
	
}
}
