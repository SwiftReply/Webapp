package com.gpc.techForum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gpc.techForum.Entity.JoinQuestionTechnology;
import com.gpc.techForum.Entity.Technology;
import com.gpc.techForum.Service.JoinQuestionTechnologyService;
import com.gpc.techForum.Service.TechnologyService;

@RestController
public class JoinQuestionTechnologyController {

	@Autowired 
	JoinQuestionTechnologyService joinQuestionTechnologyService;
	
	@GetMapping(value = "/getJoinQuestionTechnologyById/{id}", produces = "application/json; charset=UTF-8")
    public JoinQuestionTechnology getJoinQuestionTechnologyById(@PathVariable(required = true) long id) {
		
		JoinQuestionTechnology joinQuestionTechnology = joinQuestionTechnologyService.getById(id);
		return joinQuestionTechnology;
	}
	
	@GetMapping(value = "/getAllJoinQuestionTechnology", produces = "application/json; charset=UTF-8")
    List<JoinQuestionTechnology> getAllJoinQuestionTechnology() {
        return joinQuestionTechnologyService.getAll();
    }
	
	@PostMapping(path = "/addJoinQuestionTechnology", consumes = "application/json", produces = "application/json")
    public void addJoinQuestionTechnology(@RequestBody JoinQuestionTechnology joinQuestionTechnology) {
		joinQuestionTechnologyService.add(joinQuestionTechnology);
    }
}
