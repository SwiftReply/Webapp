package com.gpc.techForum.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpc.techForum.Entity.Comments;
import com.gpc.techForum.Repository.CommentsRepository;

@Component
public class CommentsService {

@Autowired CommentsRepository repository;
	
	public void add(Comments comments) {
        repository.save(comments);
    }
    public void delete(long id) {
        repository.deleteById(id);
    }
    public List<Comments> getComments() {
        return (List<Comments>) repository.findAll();
    }
    public Comments getCommentsById(long id) {
        Optional<Comments> optionalComments = repository.findById(id);
        if(optionalComments.isPresent())
        {
        	return optionalComments.get();
        }
        return null;
    }
    public List<Comments> getCommentsByQId(long qid) {
    	List<Comments> listComments = repository.findByQid(qid);
        if(listComments.size() > 0)
        {
        	return listComments;
        }
        return null;
    }
}
