package com.orthofx.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		
		final List<Customer> Customers = new ArrayList<Customer>();
		Iterable<Customer> it=customerRepository.findAll();
		it.forEach(e -> Customers.add(e));
		return Customers;
		
	}
	
	public Customer getCustomer(String id) {
		
		return customerRepository.findOne(id);
		
	}
	public void addCustomer(Customer Customer) {
		
		customerRepository.save(Customer);
		
	}
	public void updateCustomer(String id, Customer Customer) {
		
		customerRepository.save(Customer);
		
	}
	public void deleteCustomer(String id) {
		
		customerRepository.delete(id);
		
	}	
	

}
