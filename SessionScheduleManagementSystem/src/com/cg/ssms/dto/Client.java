package com.cg.ssms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ScheduledSessions")
public class Client {
	
	@Id
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private Integer duration;

	@Column
	private String faculty;
	
	@Column
	private String mode1;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMode1() {
		return mode1;
	}

	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}

}
