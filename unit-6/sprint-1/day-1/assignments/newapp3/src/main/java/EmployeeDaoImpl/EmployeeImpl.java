package EmployeeDaoImpl;

import Exceptions.EmployeeException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import EmployeeDao.EmployeeInterface;
import sprint1class1unit6.Employee;
import sprint1class1unit6.EmployeeUtility;

public class EmployeeImpl implements EmployeeInterface{

	public String registerEmployee(Employee employee) throws EmployeeException {
String message = "Sign up Failed";
		
		try(Connection con = EmployeeUtility.provideConnection()){
			
			PreparedStatement ps =  con.prepareStatement("insert into employee3(eid, name, address, salary) values (?,?,?,?)");
			
			ps.setInt(1, employee.getEmployeeId());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getEaddress());
			ps.setInt(4, employee.getEsalary());
			
			int x = ps.executeUpdate();
			
			if (x > 0) message = "Sign up Successfull";
			
		}
		catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=null;
		try(Connection con=EmployeeUtility.provideConnection()){
			PreparedStatement ps=con.prepareStatement("select * from Employee3 where eid=?");
				ps.setInt(1,empId);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a=rs.getString("address");
				int s =rs.getInt("salary");
				 emp = new Employee(r, n,a,s);
			}
		}
		catch(SQLException e) {
				e.printStackTrace();
		}
		return emp;
	}

}
