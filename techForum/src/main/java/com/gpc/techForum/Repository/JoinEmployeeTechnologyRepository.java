package com.gpc.techForum.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gpc.techForum.Entity.JoinEmployeeTechnology;

@Repository
public interface JoinEmployeeTechnologyRepository extends CrudRepository<JoinEmployeeTechnology, Long> {
	
	@Query("select c from JoinEmployeeTechnology c where c.Empid = :empId")
	public List<JoinEmployeeTechnology> findByEmpid(@Param("empId") String empId);
}
