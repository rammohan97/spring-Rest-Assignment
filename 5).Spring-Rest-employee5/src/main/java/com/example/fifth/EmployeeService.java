package com.example.fifth;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	List<Employee> getEmployee(int id);

	List<Employee> getEmployee();

	List<Employee> addOneEmployee(Employee employee);

	List<Employee> updateOneEmployee(int id, Employee employee);

	List<Employee> deleteOneInventory(int id);

	
	
	
	
}
