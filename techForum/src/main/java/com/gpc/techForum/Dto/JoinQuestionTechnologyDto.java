package com.gpc.techForum.Dto;

public class JoinQuestionTechnologyDto {

	private long Id;
	
    private long QId;
	
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
