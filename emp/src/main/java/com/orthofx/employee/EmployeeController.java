package com.orthofx.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orthofx.customer.Customer;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
      
	@RequestMapping("/Customer/{id}/Employee")
	public List<Employee> getAllEmployees(@PathVariable String id) {
		return employeeService.getAllEmployees(id);
	}
	
	@RequestMapping("/Customer/{eId}/Employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Customer/{eId}/Employee")
	public void addEmployee(@RequestBody Employee employee, @PathVariable String eId) {
		employee.setCustomer(new Customer(eId, " ", ""));
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Customer/{eId}/Employee/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id, @PathVariable String eId ) {
		employee.setCustomer(new Customer(eId, " ", ""));
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Customer/{eId}/Employee/{id}")
	public void deleteFav(@PathVariable String id ) {
		employeeService.deleteEmployee(id);
	}

}
