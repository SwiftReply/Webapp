package com.gpc.techForum.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"JoinQuestionTechnology\"")
public class JoinQuestionTechnology {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private long Id;
	
	@Column(name="qid")
    private long QId;
	
	@Column(name="techid")
    private int TechId;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public long getQId() {
		return QId;
	}

	public void setQId(long qId) {
		QId = qId;
	}

	public int getTechId() {
		return TechId;
	}

	public void setTechId(int techId) {
		TechId = techId;
	}
	
	

}
