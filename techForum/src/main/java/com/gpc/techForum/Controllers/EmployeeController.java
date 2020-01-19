package com.gpc.techForum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpc.techForum.Entity.Employee;
import com.gpc.techForum.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	@GetMapping(value = "/getEmployeeById/{id}", produces = "application/json; charset=UTF-8")
    public Employee getEmployeeById(@PathVariable(required = true) String id) {
		
		Employee employee = employeeService.getEmployeeById(id);
		return employee;
	}
	
	@GetMapping(value = "/getAllEmployees", produces = "application/json; charset=UTF-8")
    List<Employee> getAllEmployees() {
        return employeeService.getEmployees();
    }
	
	@PostMapping(path = "/addEmployee", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody Employee employee) {
		employeeService.add(employee);
    }

}
