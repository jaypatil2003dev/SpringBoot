package com.project.payroll.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.payroll.entity.Employee;
import com.project.payroll.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService service;
	
	@GetMapping("/add")
	public String home() {
		return "add-employee";
	}
	
	@PostMapping("/add")
    public String addEmployee(Employee employee) {
        service.addEmployee(employee);
        return "redirect:/view";
    }

    @GetMapping("/view")
    public String viewEmployees(Map<String, Object> map) {
        map.put("list", service.getAllEmployees());
        return "view-employees";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Map<String, Object> map) {
        Employee e = service.getEmployeeById(id);
        map.put("emp", e);
        return "edit-employee";
    }
    
    @PostMapping("/update")
    public String update(Employee employee) {
        service.update(employee);
        return "redirect:/view";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/view";
    }





}
