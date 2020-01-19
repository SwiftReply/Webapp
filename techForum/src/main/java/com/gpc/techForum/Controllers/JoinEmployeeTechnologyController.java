package com.gpc.techForum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gpc.techForum.Entity.JoinEmployeeTechnology;
import com.gpc.techForum.Service.JoinEmployeeTechnologyService;

@RestController
public class JoinEmployeeTechnologyController {

	@Autowired 
	JoinEmployeeTechnologyService joinEmployeeTechnologyService;
	
	@GetMapping(value = "/getJoinEmployeeTechnologyById/{id}", produces = "application/json; charset=UTF-8")
    public JoinEmployeeTechnology getJoinEmployeeTechnologyById(@PathVariable(required = true) long id) {
		
		JoinEmployeeTechnology joinEmployeeTechnology = joinEmployeeTechnologyService.getById(id);
		return joinEmployeeTechnology;
	}
	
	@GetMapping(value = "/getAllJoinEmployeeTechnology", produces = "application/json; charset=UTF-8")
    List<JoinEmployeeTechnology> getAllJoinEmployeeTechnology() {
        return joinEmployeeTechnologyService.getAll();
    }
	
	@PostMapping(path = "/addJoinEmployeeTechnology", consumes = "application/json", produces = "application/json")
    public void addJoinEmployeeTechnology(@RequestBody JoinEmployeeTechnology joinEmployeeTechnology) {
		joinEmployeeTechnologyService.add(joinEmployeeTechnology);
    }
	
	@GetMapping(value = "/getTechIdByEmpId/{empid}", produces = "application/json; charset=UTF-8")
    public List<Integer> getTechIdByEmpId(@PathVariable(required = true) String empid) {
		
		return joinEmployeeTechnologyService.getTechIdByEmpId(empid);
	}
}
