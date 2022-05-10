package com.fiedlercooper.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.EmployeeEntity;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MavenDemoProjectApplication.class, args);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		EmployeeEntity employee = new EmployeeEntity();
		
		t.commit();
		
		System.out.println("Successfully Created Table");
		
		factory.close();
		session.close();
		
	}

}
