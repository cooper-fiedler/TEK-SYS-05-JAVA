package jpa.service;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import org.hibernate.Session;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;
import static jpa.mainrunner.SMSRunner.factory;

public class CourseService implements CourseDAO {

	// QUERY TO PULL ALL COURSES FROM DB AND RETURN AS LIST
	
    @Override
    public List<Course> getAllCourses() {
        Session session = factory.openSession();
        try {
        TypedQuery query = session.createQuery("FROM Course");
        List<Course> results= query.getResultList();
        session.close();
        return results;
        } catch (NoResultException e){
            session.close();
            System.out.println("No Result Found");
            return Collections.emptyList();
        }
    }


}