package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(query="Select e from Employee e where e.eid= :id", name="find employee by id")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int eid;
 private String ename;
 private int salary;
 private String deg;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDeg() {
	return deg;
}
public void setDeg(String deg) {
	this.deg = deg;
}



public Employee(int eid, String ename, int salary, String deg) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
	this.deg = deg;
}
public Employee(String ename, int salary, String deg) {
	super();
	this.ename = ename;
	this.salary = salary;
	this.deg = deg;
}
 
public Employee(){
	
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
}




}
