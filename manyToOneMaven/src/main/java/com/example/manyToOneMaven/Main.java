package com.example.manyToOneMaven;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.DepartmentEntity;
import entity.TeacherEntity;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

//		DepartmentEntity it_dept = new DepartmentEntity();
//		it_dept.setDeptName("IT");
//		
//		DepartmentEntity hr_dept = new DepartmentEntity();
//		hr_dept.setDeptName("HR");

//		TeacherEntity t5 = new TeacherEntity();
//		t5.setTeacherName("Dave");
//		t5.setSalary("70K");
//		t1.setDepartment(it_dept);

//		TeacherEntity t6 = new TeacherEntity();
//		t6.setTeacherName("Bob");
//		t6.setSalary("45K");
//		t2.setDepartment(hr_dept);

//		TeacherEntity t7 = new TeacherEntity();
//		t7.setTeacherName("Sara");
//		t7.setSalary("95K");
//		t3.setDepartment(it_dept);

//		TeacherEntity t8 = new TeacherEntity();
//		t8.setTeacherName("Joe");
//		t8.setSalary("65K");
//		t4.setDepartment(hr_dept);

//		session.save(hr_dept);
//		session.save(it_dept);

//		List<TeacherEntity> teacherList = new ArrayList<TeacherEntity>();

//		session.save(t5);
//		session.save(t6);
//		session.save(t7);
//		session.save(t8);

//		teacherList.add(t5);
//		teacherList.add(t6);
//		teacherList.add(t7);
//		teacherList.add(t8);

//		DepartmentEntity dept = new DepartmentEntity();
//		dept.setDeptName("Development");
//		dept.setTeacherList(teacherList);
		
//		session.save(dept);

		t.commit();
		session.close();

	}

}
