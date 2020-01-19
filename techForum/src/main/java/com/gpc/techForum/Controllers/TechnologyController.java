package com.gpc.techForum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gpc.techForum.Entity.Technology;
import com.gpc.techForum.Service.TechnologyService;

@RestController
public class TechnologyController {

	@Autowired 
	TechnologyService technologyService;
	
	@GetMapping(value = "/getTechnologyById/{id}", produces = "application/json; charset=UTF-8")
    public Technology getTechnologyById(@PathVariable(required = true) int id) {
		
		Technology technology = technologyService.getTechnologyById(id);
		return technology;
	}
	
	@GetMapping(value = "/getAllTechnologies", produces = "application/json; charset=UTF-8")
    List<Technology> getAllTechnologies() {
        return technologyService.getTechnologies();
    }
	
	@PostMapping(path = "/addTechnology", consumes = "application/json", produces = "application/json")
    public void addTechnology(@RequestBody Technology technology) {
		technologyService.add(technology);
    }
	@GetMapping(value = "/getTechnologyIdByName/{name}", produces = "application/json; charset=UTF-8")
    public int getTechnologyIdByName(@PathVariable(required = true) String name) {
		
		return technologyService.getByName(name);
	}
}
