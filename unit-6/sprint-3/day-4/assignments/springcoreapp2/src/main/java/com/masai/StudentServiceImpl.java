package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO sDAO;
	
	
	@Override
	public String SaveStudent(Student student) {
		// TODO Auto-generated method stub
	 return sDAO.InsertStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return sDAO.GetAllStudents();
	}

}
