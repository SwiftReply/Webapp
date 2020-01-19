package com.gpc.techForum.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpc.techForum.Entity.Comments;
import com.gpc.techForum.Entity.Question;

@Repository
public interface CommentsRepository extends CrudRepository<Comments, Long> {
	
	@Query("select c from Comments c where c.QId = :qId")
	public List<Comments> findByQid(long qId);
}
