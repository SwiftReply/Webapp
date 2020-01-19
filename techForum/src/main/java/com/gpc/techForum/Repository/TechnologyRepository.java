package com.gpc.techForum.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpc.techForum.Entity.Technology;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Integer> {
	
	@Query("select c from Technology c where c.Name = :name")
	public Technology findByName(String name);
}
