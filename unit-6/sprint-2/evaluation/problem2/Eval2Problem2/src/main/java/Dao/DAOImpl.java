package Dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import beans.Course;
import beans.Student;
import exceptions.StudentException;
import utility.EMUtil;

public class DAOImpl implements DAOInt{

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		EntityManager em= EMUtil.provideManager();
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void getStudent(int roll_no) throws StudentException {
		// TODO Auto-generated method stub
		if(roll_no>0) {
		EntityManager em= EMUtil.provideManager();

		String jpql="select * from student where roll_no=?1";
		Query q=em.createNativeQuery(jpql, Student.class);
		q.setParameter(1, roll_no);
		
		Student s=(Student) q.getSingleResult();
		System.out.println(s);
		Course courseId=(Course)q.getSingleResult();
		Query q1=em.createNativeQuery("select * from Course where courseId=?1", Course.class);
		q1.setParameter(1, courseId);
		System.out.println(q.getSingleResult());
		}
		else {
			throw new StudentException("roll no not found");
		}
	}

	@Override
	public void getCourse(int course_id) throws Exception {
		// TODO Auto-generated method stub
		if(course_id>0) {
		EntityManager em= EMUtil.provideManager();
		String jpql="select * from Course where course_id=?1";
		Query q=em.createNativeQuery(jpql, Course.class);
		q.setParameter(course_id, 1);
		System.out.println(q.getResultList());
		}
		else {
			throw new StudentException("roll no not found");
		}
	}
	
	
	

	
}
