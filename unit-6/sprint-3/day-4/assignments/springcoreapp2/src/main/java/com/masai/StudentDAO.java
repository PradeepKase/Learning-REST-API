package com.masai;

import java.util.List;

public interface StudentDAO {

	public String InsertStudent(Student student);
	public List<Student> GetAllStudents();
}
