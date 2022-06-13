package com.fiedlercooper.model;

import javax.persistence.Entity;

@Entity
public class StudentModel {

	private String rollNo;
	private String name;

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

}
