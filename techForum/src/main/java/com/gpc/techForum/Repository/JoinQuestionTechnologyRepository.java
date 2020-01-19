package com.gpc.techForum.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gpc.techForum.Entity.JoinQuestionTechnology;

@Repository
public interface JoinQuestionTechnologyRepository extends CrudRepository<JoinQuestionTechnology, Long> {}
