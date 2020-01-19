package com.gpc.techForum.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpc.techForum.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {}