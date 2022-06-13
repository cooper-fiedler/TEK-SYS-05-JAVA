package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//	Defines the class as a table entity

@Entity
@Table(name = "student")

public class Student {

//	Labels and names the columns
//	Asserts non null values and char lengths
	
	@Id
	@Column(name = "email", nullable = false, length = 50)
	private String sEmail;
	@Column(name = "name", nullable = false, length = 50)
	private String sName;
	@Column(name = "password", nullable = false, length = 50)
	private String sPassword;

	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	private List<Course> sCourses;

	
//	CONSTRUCTORS
	
	
	public Student() {
		sEmail = "";
		sName = "";
		sPassword = "";
		sCourses = new ArrayList<Course>();
	}

	public Student(String sEmail, String sName, String sPassword, List<Course> sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPassword = sPassword;
		this.sCourses = sCourses;
	}
	
//	GETTERS AND SETTERS

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

}
