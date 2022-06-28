package com.fiedlercooper.bikeBuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiedlercooper.bikeBuilder.entity.Bike;

// REPOSITORY TO EXTEND JPA REPO FOR ADDITIONAL DATABASE METHODS, QUERIES, AND CONTROLS

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
