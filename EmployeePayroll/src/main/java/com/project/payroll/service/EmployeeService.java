package com.project.payroll.service;

import java.util.List;

import com.project.payroll.entity.Employee;

public interface EmployeeService {
	void addEmployee(Employee e);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	void update(Employee e);
	void delete(int id);

}
