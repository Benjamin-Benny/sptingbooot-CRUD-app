package com.orthofx.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
		

		@Autowired
		private CustomerService customerService;
	      
		@RequestMapping("/Customer")
		public List<Customer> getAllCustomers() {
			return customerService.getAllCustomers();
		}
		
		@RequestMapping("/Customer/{id}")
		public Customer getCustomer(@PathVariable String id) {
			return customerService.getCustomer(id);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/Customer")
		public void addCustomer(@RequestBody Customer Customer) {
			customerService.addCustomer(Customer);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/Customer/{id}")
		public void updateCustomer(@RequestBody Customer Customer, @PathVariable String id ) {
			customerService.updateCustomer(id, Customer);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/Customer/{id}")
		public void deleteCustomer(@PathVariable String id ) {
			customerService.deleteCustomer(id);
		}
		
		
	}