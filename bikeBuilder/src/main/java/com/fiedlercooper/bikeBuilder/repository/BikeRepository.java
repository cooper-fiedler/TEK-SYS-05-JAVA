package com.fiedlercooper.bikeBuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiedlercooper.bikeBuilder.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
