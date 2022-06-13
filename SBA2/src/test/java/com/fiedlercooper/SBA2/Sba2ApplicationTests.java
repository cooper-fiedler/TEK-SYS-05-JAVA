package com.fiedlercooper.SBA2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Student;
import jpa.service.StudentService;

import org.junit.jupiter.api.Test;

class Sba2ApplicationTests {
StudentDAO studentService= new StudentService();
	@Test
	void testStudentLoad() {
		// Runs the getStudentByEmail method and confirms that the name belongs to the email
		Student student = studentService.getStudentByEmail("cstartin3@flickr.com");
		assertEquals("Clem Startin", student.getsName());
	}

}