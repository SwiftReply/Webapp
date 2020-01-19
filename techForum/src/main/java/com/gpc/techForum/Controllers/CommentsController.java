package com.gpc.techForum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gpc.techForum.Entity.Comments;
import com.gpc.techForum.Service.CommentsService;

@RestController
public class CommentsController {

	@Autowired 
	CommentsService commentsService;
	
	@GetMapping(value = "/getCommentsById/{id}", produces = "application/json; charset=UTF-8")
    public Comments getCommentsById(@PathVariable(required = true) int id) {
		
		Comments comments = commentsService.getCommentsById(id);
		return comments;
	}
	
	@GetMapping(value = "/getAllComments", produces = "application/json; charset=UTF-8")
    List<Comments> getAllComments() {
        return commentsService.getComments();
    }
	
	@PostMapping(path = "/addComments", consumes = "application/json", produces = "application/json")
    public void addTechnology(@RequestBody Comments comments) {
		commentsService.add(comments);
    }
	
	@GetMapping(value = "/getCommentsByQId/{qid}", produces = "application/json; charset=UTF-8")
    public List<Comments> getCommentsByQId(@PathVariable(required = true) long qid) {
		
		return commentsService.getCommentsByQId(qid);
	}
}
