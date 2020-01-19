package com.gpc.techForum.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Employee\"")
public class Employee {
	
	@Id
	@Column(name="empid")
    private String EmpId;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="project")
	private String Project;
	
	@Column(name="emailid")
	private String EmailId;
	
	@Column(name="password")
	private String Password;

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getProject() {
		return Project;
	}

	public void setProject(String project) {
		Project = project;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
