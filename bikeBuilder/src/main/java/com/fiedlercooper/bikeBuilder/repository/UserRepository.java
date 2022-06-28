package com.fiedlercooper.bikeBuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fiedlercooper.bikeBuilder.entity.User;

// REPOSITORY TO EXTEND JPA REPO FOR ADDITIONAL DATABASE METHODS, QUERIES, AND CONTROLS

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// CUSTOM QUERY TO RETRIEVE A USER BASED ON SELECTED EMAIL
	
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);
     
}
