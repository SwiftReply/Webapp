package com.gpc.techForum.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpc.techForum.Entity.JoinEmployeeTechnology;
import com.gpc.techForum.Entity.Question;
import com.gpc.techForum.Repository.QuestionRepository;

@Component
public class QuestionService {

@Autowired QuestionRepository repository;
	
	public void add(Question question) {
        repository.save(question);
    }
    public void delete(long id) {
        repository.deleteById(id);
    }
    public List<Question> getQuestions() {
        return (List<Question>) repository.findAll();
    }
    public Question getQuestionById(long id) {
        Optional<Question> optionalQuestion = repository.findById(id);
        if(optionalQuestion.isPresent())
        {
        	return optionalQuestion.get();
        }
        return null;
    }
    public List<Question> getByEmpId(String empId) {
    	return (List<Question>) repository.findByEmpid(empId);
    }
    public Question getLastId() {
    	return repository.findTopByOrderByQIdDesc();
    }
}
