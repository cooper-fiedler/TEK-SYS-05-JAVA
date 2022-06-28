package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.DriveTrain;

//INTERFACE FOR GENERAL CRUD OPERATIONS

public interface DriveTrainService {
	List<DriveTrain> getAllDriveTrains();

	DriveTrain saveDriveTrain(DriveTrain driveTrain);

	DriveTrain getDriveTrainById(Long id);

	DriveTrain updateDriveTrain(DriveTrain driveTrain);

	void deleteDriveTrainById(Long id);
}
