package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.services.ServicesDao;

@RestController
public class CustomerController {

	@Autowired
	private ServicesDao cservices;
	@PostMapping("/customer")
	public ResponseEntity<Customer> registerCustomerHanlder(@RequestBody Customer customer) throws CustomerException{
		
		Customer savedcustomer= cservices.registerCustomer(customer);
		
		return new ResponseEntity<Customer>(savedcustomer, HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> getcustomerByIdHandler(@PathVariable("customerId") Integer customerId) throws CustomerException{
		
		Customer cus = cservices.getCustomerById(customerId);
		return new ResponseEntity<Customer>(cus,HttpStatus.OK);
		
	}
	

	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomersDetailshnadler() throws CustomerException{
		
		List<Customer> cus =cservices.getAllCustomerDetails();
		
		return new ResponseEntity<List<Customer>>(cus,HttpStatus.OK);
		
		
	}
	
	
	@DeleteMapping("/delcustomer/{customerId}")
	public ResponseEntity<Customer> deleteCustomerByIdHandler(@PathVariable("customerId") Integer customerId) throws CustomerException{
		
		Customer cus =cservices.deleteCustomerById(customerId);
		
		return new ResponseEntity<Customer>(cus,HttpStatus.OK);
		
	}
	
	
	@PutMapping("/updatecustomer")
	public ResponseEntity<Customer> updateEmployeeHandler(@RequestBody Customer cus) throws CustomerException{
		
		Customer cus1 =cservices.updateCustomer(cus);
		
		return new ResponseEntity<Customer>(cus1,HttpStatus.OK);
	}
	
//	
//	@PutMapping("/updatebook")
//	public ResponseEntity<Customer> updatebookhander(@RequestBody Customer c) throws CustomerException{
//		Customer updatedbook=cservice.
//		return new ResponseEntity<Customer>(updatedbook, HttpStatus.ACCEPTED);
//	}
	
	
//	@GetMapping("/customer/{customerId}")
//	public ResponseEntity<List<Customer>> getcustomerByNameHandler(@PathVariable("customerId") Integer customerId) throws CustomerException{
//		
//		Customer cus = cservices.getCustomerById(customerId);
//		return new ResponseEntity<Customer>(cus,HttpStatus.OK);
//		
//	}
}
