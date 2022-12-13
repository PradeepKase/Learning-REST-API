package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.utility.EMUtil;
@Repository
public class StudentDAOImpl implements StudentDAO{

	@Override
	public String InsertStudent(Student student) {
		// TODO Auto-generated method stub
							 
		EntityManager em=EMUtil.provideManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		return "student obj added to table";
	}

	@Override
	public List<Student> GetAllStudents() {
		// TODO Auto-generated method stub
//		return null;
		EntityManager em=EMUtil.provideManager();
		Query q=em.createQuery("from Student");
		 List<Student> stu= q.getResultList();
		 em.close();
		 return stu;
	}

}
