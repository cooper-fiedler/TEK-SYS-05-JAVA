package com.fiedlercooper.bikeBuilder.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.DriveTrain;
import com.fiedlercooper.bikeBuilder.repository.DriveTrainRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class DriveTrainServiceImpl implements DriveTrainService{
	private DriveTrainRepository driveTrainRepository;
	
	public DriveTrainServiceImpl(DriveTrainRepository driveTrainRepository) {
		this.driveTrainRepository = driveTrainRepository;
	}

	@Override
	public List<DriveTrain> getAllDriveTrains() {
		return driveTrainRepository.findAll();
	}

	@Override
	public DriveTrain saveDriveTrain(DriveTrain driveTrain) {
		return driveTrainRepository.save(driveTrain);
	}

	@Override
	public DriveTrain getDriveTrainById(Long id) {
		return driveTrainRepository.findById(id).get();
	}

	@Override
	public DriveTrain updateDriveTrain(DriveTrain driveTrain) {
		return driveTrainRepository.save(driveTrain);
	}

	@Override
	public void deleteDriveTrainById(Long id) {
		driveTrainRepository.deleteById(id);
		
	}

	

	

}
