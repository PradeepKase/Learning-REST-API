package usecases;

import java.util.List;
import java.util.Scanner;


import Dao.DAOInt;
import exceptions.StudentException;

public class getstudent {
	public static void Getstudent(Scanner sc) throws Exception {
		System.out.println("Enter student roll no :");
		int roll_no = sc.nextInt();

		DAOInt dao = new Dao.DAOImpl();
		try {
			dao.getStudent(roll_no);

		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
}
}
