package com.usecase;

import javax.persistence.EntityManager;

import com.model.FullTimeInstructor;
import com.model.PartTimeInstructor;
import com.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.proveidEntityManager();
		
		FullTimeInstructor f1 = new FullTimeInstructor();
		
		f1.setInstructorName("Demo");
		f1.setEmail("Demo");
		f1.setSalary(10000);
		
        FullTimeInstructor f2 = new FullTimeInstructor();
		
		f2.setInstructorName("Demo");
		f2.setEmail("Demo");
		f2.setSalary(10000);
		
        FullTimeInstructor f3 = new FullTimeInstructor();
		
		f3.setInstructorName("Demo");
		f3.setEmail("Demo");
		f3.setSalary(10000);
		
        FullTimeInstructor f4 = new FullTimeInstructor();
		
		f4.setInstructorName("Demo");
		f4.setEmail("Demo");
		f4.setSalary(10000);
		
		PartTimeInstructor p1 = new PartTimeInstructor();
		p1.setInstructorName("Demo");
		p1.setNoOfSession(2);
		p1.setCostPerSession(555);
		p1.setMobileNumber("123456");
		
		
		PartTimeInstructor p2 = new PartTimeInstructor();
		p2.setInstructorName("Demo");
		p2.setNoOfSession(2);
		p2.setCostPerSession(555);
		p2.setMobileNumber("123456");
		
		PartTimeInstructor p3 = new PartTimeInstructor();
		p3.setInstructorName("Demo");
		p3.setNoOfSession(2);
		p3.setCostPerSession(555);
		p3.setMobileNumber("123456");
		
		PartTimeInstructor p4 = new PartTimeInstructor();
		p4.setInstructorName("Demo");
		p4.setNoOfSession(2);
		p4.setCostPerSession(555);
		p4.setMobileNumber("123456");	
		
		em.getTransaction().begin();
		
		em.persist(f1);
		em.persist(f2);
		em.persist(p3);
		em.persist(p4);
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("done");
		
	
	}

}
