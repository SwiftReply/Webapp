package com.gpc.techForum.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Question\"")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="qid")
    private long QId;
	
	@Column(name="empid")
	private String Empid;
	
	@Column(name="description")
	private String Description;

	public long getQId() {
		return QId;
	}

	public void setQId(long qId) {
		QId = qId;
	}

	public String getEmpid() {
		return Empid;
	}

	public void setEmpid(String empid) {
		Empid = empid;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	

}
