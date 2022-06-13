package jpa.mainrunner;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Select;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	// DAO OBJECT DECLARATION

	CourseDAO courseService = new CourseService();
	StudentDAO studentService = new StudentService();
	private Scanner sin;
	private StringBuilder sb;
	private Student currentStudent;

	// SESSION CONFIG AND STARTUP
	public static final SessionFactory factory = new Configuration().configure().buildSessionFactory();
	// DEFAULT CASES, QUITTING PROGRAM, AND FATAL HANDLED EXCEPTIONS
	// WILL CLOSE THE SESSION TO ELIMINATE ACTIVE DB CONNECTION

	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();

	}

	public static void main(String[] args) {

		SMSRunner sms = new SMSRunner();

		sms.run();

		// MAIN PROGRAM RUNS HERE

	}

	private void run() {
		// Login or quit
		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			out.println("Goodbye!");
			factory.close();
			break;

		default:
			out.println("Invalid selection - Goodbye!");
			factory.close();
			break;
		}
	}

	// MAIN MENU

	private int menu1() {
		sb.append("\n1.Student Login\n2. Quit Application\nPlease Enter Selection: ");
		out.print(sb.toString());
		sb.delete(0, sb.length());
		try {
			return sin.nextInt();
		} catch (InputMismatchException e) {
			return 0;
		}
	}

	// POST LOGIN INFORMATION DISPLAY AND PROCESSING

	private boolean studentLogin() {

		boolean retValue = false;
		out.print("Enter your email address: ");
		String email = sin.next();
		out.print("Enter your password: ");
		String password = sin.next();

		Student student = studentService.getStudentByEmail(email);
		if (student != null) {
			currentStudent = student;
		} else {
			currentStudent = null;
		}

		if (currentStudent != null) {
			if (currentStudent.getsPassword().equals(password)) {
				List<Course> courses = studentService.getStudentCourses(email);
				out.println("My Classes");
				out.printf("%5s%20S%25s\n", "#", "Course", "Instructor");
				for (Course course : courses) {
					out.printf("%5s%5s%-30S%-15s\n", course.getcId(), " ", course.getcName(),
							course.getcInstructorName());
				}
			}
			retValue = true;
		} else {
			out.println("User Validation failed. GoodBye!");
			factory.close();
		}
		return retValue;
	}

	// SECONDARY MENU FOR REGISTRATION

	private void registerMenu() {

		sb.append("\n1.Register a class\n2. Logout\nPlease Enter Selection: ");
		out.print(sb.toString());
		sb.delete(0, sb.length());

		switch (sin.nextInt()) {
		case 1:
			List<Course> allCourses = courseService.getAllCourses();
			List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getsEmail());
			allCourses.removeAll(studentCourses);
			out.printf("%5s%20S%25s\n", "ID", "Course", "Instructor");
			for (Course course : allCourses) {
				out.printf("%5s%5s%-30S%-15s\n", course.getcId(), " ", course.getcName(), course.getcInstructorName());
			}
			out.println();
			out.print("Enter Course Number: ");
			int number = sin.nextInt();

			studentService.registerStudentToCourse(currentStudent.getsEmail(), number);
			Student temp = studentService.getStudentByEmail(currentStudent.getsEmail());

			StudentService sService = new StudentService();
			List<Course> sCourses = sService.getStudentCourses(temp.getsEmail());

			out.println("My Classes");
			out.printf("%5s%20S%25s\n", "ID", "Course", "Instructor");
			for (Course course : sCourses) {
				out.printf("%5s%5s%-30S%-15s\n", course.getcId(), " ", course.getcName(), course.getcInstructorName());
			}
			registerMenu();
		case 2:
		default:
			out.println("Invalid Selection - Goodbye!");
			factory.close();

		}
	}
}