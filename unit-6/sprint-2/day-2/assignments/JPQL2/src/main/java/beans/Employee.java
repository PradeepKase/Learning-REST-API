package beans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	
	@ElementCollection(fetch=FetchType.EAGER)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empID;
	private String name;
	private String gender;
	private int salary;
	
	@ElementCollection
	@Embedded
	private Set<Address> employeeaddress=new HashSet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getEmployeeaddress() {
		return employeeaddress;
	}

	public void setEmployeeaddress(Set<Address> employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public Employee() {
		
	}
	public Employee(int empID, String name, String gender, int salary, Set<Address> employeeaddress) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.employeeaddress = employeeaddress;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", employeeaddress=" + employeeaddress + "]";
	}

	public List<Employee> getAddresses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
