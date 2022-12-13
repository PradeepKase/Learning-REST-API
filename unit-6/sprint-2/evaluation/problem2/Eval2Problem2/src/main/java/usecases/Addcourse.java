package usecases;


import java.util.Scanner;


import Dao.DAOInt;
import beans.Course;

public class Addcourse {
	public static void addcourse(Scanner sc) {
	
	System.out.println("Enter course Name :");
	String name = sc.next();
	
	System.out.println("Enter course Duration :");
	String Duration = sc.nextLine();
	sc.nextLine();
	
	System.out.println("Enter course fee  :");
	int Fee=sc.nextInt();
	
	Course d = new Course();
	d.setCourseName(name);
	d.setDuration(Duration);
	d.setFee(Fee);

	
	DAOInt dao = new Dao.DAOImpl();
	dao.addCourse(d);
	
	System.out.println("Department Added Successfully !");
	}
}
