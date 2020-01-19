package com.gpc.techForum.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"JoinEmployeeTechnology\"")
public class JoinEmployeeTechnology {

	@Column(name="empid")
	private String Empid;
	
	@Column(name="techid")
	private int TechId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private long Id;

	public String getEmpid() {
		return Empid;
	}

	public void setEmpid(String empid) {
		Empid = empid;
	}

	public int getTechId() {
		return TechId;
	}

	public void setTechId(int techId) {
		TechId = techId;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	
	
}
