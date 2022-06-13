package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class TeacherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teachId;
	private String salary;
	private String teacherName;

//	@ManyToOne
//	@JoinColumn(name = "fkey_dept")
//	private DepartmentEntity department;

	public TeacherEntity() {

	}

//	public TeacherEntity(int teachId, String salary, String teacherName, DepartmentEntity department) {
//		super();
//		this.teachId = teachId;
//		this.salary = salary;
//		this.teacherName = teacherName;
//		this.department = department;
//	}
	
	public TeacherEntity(int teachId, String salary, String teacherName) {
		super();
		this.teachId = teachId;
		this.salary = salary;
		this.teacherName = teacherName;

	}

	public int getTeachId() {
		return teachId;
	}

	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

//	public DepartmentEntity getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(DepartmentEntity department) {
//		this.department = department;
//	}

}