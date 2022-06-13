package jpa.service;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;


import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static jpa.mainrunner.SMSRunner.factory;

public class StudentService implements StudentDAO {
	
	// QUERY TO PULL ALL STUDENTS FROM DB AND RETURN AS LIST
	
	@Override
	public List<Student> getAllStudents() {
		Session session = factory.openSession();
		try {
			TypedQuery query = session.createQuery("FROM Student");
			List<Student> studentList = query.getResultList();
			session.close();
			return studentList;
		} catch (NoResultException e) {
			session.close();
			System.out.println("No result found");
			return Collections.emptyList();
		}
	}

	// QUERY TO PULL STUDENT FROM DB AND RETURN AS STUDENT
	
	@Override
	public Student getStudentByEmail(String sEmail) {
		Session session = factory.openSession();
		String statement = "From Student s where s.sEmail = :sEmail";
		Query query = session.createQuery(statement).setParameter("sEmail", sEmail);
		try {
			Student studentName = (Student) query.getSingleResult();
			return studentName;
		} catch (NoResultException e) {
			System.out.println("No result found");
			session.close();
			return null;
		}
	}

	// QUERY TO VALIDATE STUDENT BASED ON EMAIL AND PASSWORD AND RETURN A BOOLEAN TO CONFIRM
	
	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		Session session = factory.openSession();
		try {
			String statement = "FROM Student s WHERE s.sEmail = :sEmail";
			TypedQuery query = session.createQuery(statement).setParameter("sEmail", sEmail);
			query.setParameter("sEmail", sEmail);
			Student student = (Student) query.getSingleResult();
			session.close();
			return Objects.equals(student.getsPassword(), sPassword) && (Objects.equals(student.getsEmail(), sEmail));
		} catch (NoResultException e) {
			System.out.println("No result found");
			return false;
		}
	}
	
	
	// QUERY WITH LEFT JOIN TO PERFORM ONE TO MANY RELATIONSHIP AND CHECK
	// IF STUDENT HAS CLASS IN LIST OTHERWISE ADD

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String statement = "FROM Student s LEFT JOIN FETCH s.sCourses c WhERE s.sEmail = :sEmail";
		String statement2 = "FROM Course c WHERE c.cId = :cId";
		TypedQuery query = session.createQuery(statement).setParameter("sEmail", sEmail);
		TypedQuery query2 = session.createQuery(statement2).setParameter("cId", cId);
		Student student = (Student) query.getSingleResult();

		try {
			Course course = (Course) query2.getSingleResult();
			if (student.getsCourses().contains(course)) {

				System.out.println("You are already registered in that course!");
			} else if (!student.getsCourses().contains(course)) {
				student.getsCourses().add(course);
				System.out.println("You are now enrolled in this course.\n");
				session.save(student);
				transaction.commit();
				session.close();
			}
		} catch (NoResultException e) {
			System.out.println("No result found");
		}
	}

	
	// GET ALL STUDENT COURSES AS LIST
	
	@Override
	public List<Course> getStudentCourses(String sEmail) {
		Session session = factory.openSession();
		try {
			String statement = "FROM Student s LEFT JOIN FETCH s.sCourses WHERE s.sEmail = :sEmail";
			TypedQuery query = session.createQuery(statement).setParameter("sEmail", sEmail);
			query.setParameter("sEmail", sEmail);
			Student student = (Student) query.getSingleResult();
			List<Course> courseList = student.getsCourses();
			session.close();
			return courseList;
		} catch (NoResultException e) {
			session.close();
			System.out.println("No result found");
			return Collections.emptyList();
		}
	}

}