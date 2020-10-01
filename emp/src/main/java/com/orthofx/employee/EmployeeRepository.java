package com.orthofx.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
	public List<Employee> findByCustomerId(String id);

}