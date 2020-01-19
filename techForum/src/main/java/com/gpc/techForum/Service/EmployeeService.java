package com.gpc.techForum.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpc.techForum.Dto.EmployeeDto;
import com.gpc.techForum.Entity.Employee;
import com.gpc.techForum.Repository.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired EmployeeRepository repository;
	
	public void add(Employee employee) {
        repository.save(employee);
    }
    public void delete(String id) {
        repository.deleteById(id);
    }
    public List<Employee> getEmployees() {
        return (List<Employee>) repository.findAll();
    }
    public Employee getEmployeeById(String id) {
        Optional<Employee> optionalEmployee = repository.findById(id);
        if(optionalEmployee.isPresent())
        {
        	return optionalEmployee.get();
        }
        return null;
    }
    private Employee toEntity(EmployeeDto dto) {
        Employee entity = new Employee();
        entity.setName(dto.getName());
        entity.setProject(dto.getProject());
        return entity;
    }

}
