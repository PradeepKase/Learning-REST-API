package com.masai.services;

import java.util.List;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

public interface ServicesDao {
	public Customer registerCustomer(Customer Customer)throws CustomerException, CustomerException;
	
	public Customer getCustomerById(Integer customerId)throws CustomerException;

	public List<Customer> getAllCustomerDetails()throws CustomerException;

	public Customer deleteCustomerById(Integer customerId)throws CustomerException;
	
	
	public Customer loginCustomer(String email, String password)throws CustomerException;
	
	public List<Customer> getCustomerDetailsByAddress(String address)throws CustomerException;
	
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers()throws CustomerException;
	
	public Customer updateCustomer(Customer customer)throws CustomerException;
}
