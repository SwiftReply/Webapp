package com.gpc.techForum.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpc.techForum.Entity.JoinEmployeeTechnology;
import com.gpc.techForum.Repository.JoinEmployeeTechnologyRepository;

@Component
public class JoinEmployeeTechnologyService {

@Autowired JoinEmployeeTechnologyRepository repository;
	
	public void add(JoinEmployeeTechnology joinEmployeeTechnology) {
        repository.save(joinEmployeeTechnology);
    }
    public void delete(long id) {
        repository.deleteById(id);
    }
    public List<JoinEmployeeTechnology> getAll() {
        return (List<JoinEmployeeTechnology>) repository.findAll();
    }
    public JoinEmployeeTechnology getById(long id) {
        Optional<JoinEmployeeTechnology> optionalJoinEmployeeTechnology = repository.findById(id);
        if(optionalJoinEmployeeTechnology.isPresent())
        {
        	return optionalJoinEmployeeTechnology.get();
        }
        return null;
    }
    public List<Integer> getTechIdByEmpId(String empId) {
    	
    	List<JoinEmployeeTechnology> list = (List<JoinEmployeeTechnology>) repository.findByEmpid(empId); 
    	
    	List<Integer> techIdList = new ArrayList<>();
    	for(int i=0; i<list.size(); i++)
    	{
    		techIdList.add(list.get(i).getTechId());
    	}    	
    	return techIdList;
    }
}
