package Dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

import com.mysql.cj.Query;

import Exception.EmployeeException;
import beans.Address;
import beans.Employee;
 
public class EmployeeImpl implements EmployeeInt {

	public void RegisterEmployees() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
		EntityManager em=emf.createEntityManager();
		
		Employee emp=new Employee();
		emp.setName("Ram");
		emp.setSalary(6800);
		emp.setGender("male");
		emp.getEmployeeaddress().add(new Address("Mh", "Pune", "787887","home"));
		emp.getEmployeeaddress().add(new Address("MP", "Indore", "584542","office"));

		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("done");
		
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
		EntityManager em=emf.createEntityManager();
		javax.persistence.Query q=em.createQuery("from Employee");
		List<Employee> emps=q.getResultList();
		em.close();
		return emps;
	}

}
