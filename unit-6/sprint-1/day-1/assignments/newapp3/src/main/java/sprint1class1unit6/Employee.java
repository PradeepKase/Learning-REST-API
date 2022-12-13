package sprint1class1unit6;

public class Employee {
private int employeeId;
private String  ename;
private String eaddress;
private int esalary;

public Employee() {
	
}
public Employee(int employeeId, String ename, String eaddress, int esalary) {
	super();
	this.employeeId = employeeId;
	this.ename = ename;
	this.eaddress = eaddress;
	this.esalary = esalary;
}


public int getEmployeeId() {
	return employeeId;
}


public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getEaddress() {
	return eaddress;
}


public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}


public int getEsalary() {
	return esalary;
}


public void setEsalary(int esalary) {
	this.esalary = esalary;
}


@Override
public String toString() {
	return "EmployeeId: " + employeeId+"\n" + "name: " + ename+"\n" + "address: " + eaddress+"\n" + "salary: " + esalary;
}



}
