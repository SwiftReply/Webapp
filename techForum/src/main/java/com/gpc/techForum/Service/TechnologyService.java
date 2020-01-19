package com.gpc.techForum.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpc.techForum.Entity.Technology;
import com.gpc.techForum.Repository.TechnologyRepository;

@Component
public class TechnologyService {

@Autowired TechnologyRepository repository;
	
	public void add(Technology technology) {
        repository.save(technology);
    }
    public void delete(int id) {
        repository.deleteById(id);
    }
    public List<Technology> getTechnologies() {
        return (List<Technology>) repository.findAll();
    }
    public Technology getTechnologyById(int id) {
        Optional<Technology> optionalTechnology = repository.findById(id);
        if(optionalTechnology.isPresent())
        {
        	return optionalTechnology.get();
        }
        return null;
    }
    public int getByName(String name)
    {
    	Technology technology =  repository.findByName(name);
    	return technology.getTechId();
    }
}