package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.CustomerDao;

import com.masai.exception.CustomerException;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
@Service
public class ServecesImpl implements ServicesDao{
	
	@Autowired
	private CustomerDao cdao;
	

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Customer savedcustomer=cdao.save(customer);
		return savedcustomer;
	}


	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {

			// TODO Auto-generated method stub
			Optional<Customer> opt=cdao.findById(customerId);
			
			return opt.orElseThrow(()-> new CustomerException("Employee does not found ...."));
		}


	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		List<Customer> empl= cdao.findAll();
		if(empl.size()>0) {
			return empl;
		}
		else {
			throw new CustomerException("No Employee Registered");
		}
	}


	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
	      Optional<Customer> opt = cdao.findById(customerId);
			
			if(opt.isPresent()) {
				Customer empl = opt.get();
				cdao.delete(empl);
				return empl;
			}else {
				throw new CustomerException("Employee id not found...");
			}
	}


	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		List<Customer> empl =  cdao.getCustomerDetailsByAddress(address);
		
	if(empl.size()>0) {
			return empl;
		}else {
			throw new CustomerException("invalide address");
		}
	}


	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}


	public Customer updateCustomer(Customer customer) throws CustomerException {
		Optional<Customer> opt =cdao.findById(customer.getCustomerId());
		if(opt.isPresent()) {
			Customer updatecustomer= cdao.save(customer);
			return updatecustomer;
		}else {
			throw new CustomerException("book not updated");
		}
	}

	

//	@Override
//	public Customer loginCustomer(String email, String password) throws CustomerException {
//		
//	}
//	
	
	
	
	
		
	
}
	


