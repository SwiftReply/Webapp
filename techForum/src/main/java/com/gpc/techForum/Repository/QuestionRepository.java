package com.gpc.techForum.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gpc.techForum.Entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	@Query("select c from Question c where c.Empid = :empId")
	public List<Question> findByEmpid(String empId);
}
