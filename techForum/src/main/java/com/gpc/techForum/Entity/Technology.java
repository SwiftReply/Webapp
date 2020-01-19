package com.gpc.techForum.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Technology\"")
public class Technology {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="techid")
    private int TechId;
	
	@Column(name="name")
	private String Name;

	public int getTechId() {
		return TechId;
	}

	public void setTechId(int techId) {
		TechId = techId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
