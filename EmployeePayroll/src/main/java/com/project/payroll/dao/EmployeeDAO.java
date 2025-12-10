package com.project.payroll.dao;

import java.util.List;

import com.project.payroll.entity.Employee;

public interface EmployeeDAO {
	void save(Employee employee);
	List<Employee> getAll();
	void update(Employee employee);
	void delete(int id);
	Employee getById(int id);

}
