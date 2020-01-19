package com.gpc.techForum.Dto;

public class CommentsDto {

	private long Id;
	
    private String EmpId;
	
    private long QId;
	
	private String Description;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public long getQId() {
		return QId;
	}

	public void setQId(long qId) {
		QId = qId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
