package com.gpc.techForum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gpc.techForum.Entity.Question;
import com.gpc.techForum.Service.QuestionService;

@RestController
public class QuestionController {

	@Autowired 
	QuestionService questionService;
	
	@GetMapping(value = "/getQuestionById/{id}", produces = "application/json; charset=UTF-8")
    public Question getQuestionById(@PathVariable(required = true) long id) {
		
		Question question = questionService.getQuestionById(id);
		return question;
	}
	
	@GetMapping(value = "/getAllQuestions", produces = "application/json; charset=UTF-8")
    public List<Question> getAllQuestions() {
        return questionService.getQuestions();
    }
	
	@PostMapping(path = "/addQuestion", consumes = "application/json", produces = "application/json")
    public void addQuestion(@RequestBody Question question) {
		questionService.add(question);
    }
	
	@GetMapping(value = "/getQuestionByEmpId/{empid}", produces = "application/json; charset=UTF-8")
    public List<Question> getQuestionByEmpId(@PathVariable(required = true) String empid) {
		
		List<Question> listQuestion = questionService.getByEmpId(empid);
		return listQuestion;
	}
	
	@GetMapping(value = "/getLastQRecord", produces = "application/json; charset=UTF-8")
    public Question getLastQId() {
        return questionService.getLastId();
    }
}
