package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.Bike;

// INTERFACE FOR GENERAL CRUD OPERATIONS

public interface BikeService {
	List<Bike> getAllBikes();

	Bike saveBike(Bike bike);

	Bike getBikeById(Long id);

	Bike updateBike(Bike bike);

	void deleteBikeById(Long id);
}
