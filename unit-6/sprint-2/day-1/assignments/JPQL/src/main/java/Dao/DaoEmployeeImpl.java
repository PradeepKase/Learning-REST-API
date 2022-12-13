package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
//import com.mysql.cj.Query;
import javax.persistence.TypedQuery;

import Exceptions.EmployeeException;
import beans.Employee;

public class DaoEmployeeImpl implements DaoEmployee{

	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=null;
//		  String msg="Not imserted";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
		EntityManager em=emf.createEntityManager();
		//Employee emp=new Employee("pradeep",800000,"btech");
		emp=em.find(Employee.class, employee.getEid());
		if(emp!=null) {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();	
		}
		else {
			throw new EmployeeException("Empluyee not get with this id"+ employee.getEid());
		}

//		msg="Added ";
		System.out.println("Updated");
		em.close();
		return emp;
		
		
//		return msg;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		if(empId>0) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
			EntityManager em=emf.createEntityManager();
			TypedQuery<Employee> e = em.createQuery("Select e from Employee e where e.eid= :id", Employee.class);
			e.setParameter("id", empId);
//		TypedQuery<Employee> e=query.getSingleResult();
			
			Employee emp= e.getSingleResult();
			return emp;
		}else {
			throw new EmployeeException("the employee eid enterd is not exist");
		}

	}

	@Override
	public void getEmployeenames() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
		EntityManager em=emf.createEntityManager();
		Query query= em.createQuery("select upper(e.ename) from Employee e" );
		List<String> list=query.getResultList();
		for(String s:list) {
			System.out.println(s);
		}
	}

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
//		msg="Added ";
		System.out.println("Added");
		em.close();
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		if(empId>0) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee emp=em.find(Employee.class, empId);
		Query e = em.createQuery("DELETE FROM Employee e WHERE e.eid= :id");
		e.setParameter("id", empId);
		
		int x=e.executeUpdate();
		if(x>0) {
			System.out.println("emplyee deleted");
		}else {
			System.out.println("emplyee not delet because eid invalid");
		}
		return emp;
		}
		else {
			throw new EmployeeException("the employee eid enterd is not exist");
		}
		
	}
	

}
