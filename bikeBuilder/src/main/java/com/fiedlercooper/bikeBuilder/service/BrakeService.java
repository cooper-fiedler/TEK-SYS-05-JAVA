package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.Brake;

//INTERFACE FOR GENERAL CRUD OPERATIONS

public interface BrakeService {

	List<Brake> getAllBrakes();

	Brake saveBrake(Brake brake);

	Brake getBrakeById(Long id);

	Brake updateBrake(Brake brake);

	void deleteBrakeById(Long id);

}
