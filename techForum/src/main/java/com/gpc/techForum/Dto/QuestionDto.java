package com.gpc.techForum.Dto;

public class QuestionDto {

    private long QId;
	
	private String Empid;
	
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
