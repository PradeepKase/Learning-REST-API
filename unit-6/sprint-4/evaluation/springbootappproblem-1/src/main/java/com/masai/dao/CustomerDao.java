package com.masai.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{
//	String getNameAndAddressOfCustomerById(Integer empId);

	List<Customer> getCustomerDetailsByAddress(String address);
}
