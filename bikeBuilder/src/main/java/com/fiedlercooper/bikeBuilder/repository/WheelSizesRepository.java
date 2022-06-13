package com.fiedlercooper.bikeBuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiedlercooper.bikeBuilder.entity.WheelSizes;

public interface WheelSizesRepository extends JpaRepository<WheelSizes, Long>{

}