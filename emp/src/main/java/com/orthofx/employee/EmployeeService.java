package com.orthofx.employee;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(String empId){
		
		List<Employee> Employees = new ArrayList<Employee>();
		employeeRepository.findByCustomerId(empId)
		.forEach(Employees::add);
		return Employees;
		
	}
    public Employee getEmployee(String id) {
		
		return employeeRepository.findOne(id);
		
	}
	public void addEmployee(Employee Employee) {
		
		employeeRepository.save(Employee);
		
	}
	public void updateEmployee(Employee Employee) {
		
		employeeRepository.save(Employee);
		
	}
	public void deleteEmployee(String id) {
		
		employeeRepository.delete(id);
	}

}
