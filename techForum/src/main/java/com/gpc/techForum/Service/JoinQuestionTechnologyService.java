package com.gpc.techForum.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpc.techForum.Entity.JoinQuestionTechnology;
import com.gpc.techForum.Repository.JoinQuestionTechnologyRepository;

@Component
public class JoinQuestionTechnologyService {

@Autowired JoinQuestionTechnologyRepository repository;
	
	public void add(JoinQuestionTechnology joinQuestionTechnology) {
        repository.save(joinQuestionTechnology);
    }
    public void delete(long id) {
        repository.deleteById(id);
    }
    public List<JoinQuestionTechnology> getAll() {
        return (List<JoinQuestionTechnology>) repository.findAll();
    }
    public JoinQuestionTechnology getById(long id) {
        Optional<JoinQuestionTechnology> optionalJoinQuestionTechnology = repository.findById(id);
        if(optionalJoinQuestionTechnology.isPresent())
        {
        	return optionalJoinQuestionTechnology.get();
        }
        return null;
    }
}
