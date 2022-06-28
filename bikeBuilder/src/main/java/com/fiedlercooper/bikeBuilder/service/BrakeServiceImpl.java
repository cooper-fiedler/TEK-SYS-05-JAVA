package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.Brake;
import com.fiedlercooper.bikeBuilder.repository.BrakeRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class BrakeServiceImpl implements BrakeService {
	private BrakeRepository brakeRepository;

	public BrakeServiceImpl(BrakeRepository brakeRepository) {
		this.brakeRepository = brakeRepository;
	}

	@Override
	public List<Brake> getAllBrakes() {
		return brakeRepository.findAll();
	}

	@Override
	public Brake saveBrake(Brake brake) {
		return brakeRepository.save(brake);
	}

	@Override
	public Brake getBrakeById(Long id) {
		return brakeRepository.findById(id).get();
	}

	@Override
	public Brake updateBrake(Brake brake) {
		return brakeRepository.save(brake);
	}

	@Override
	public void deleteBrakeById(Long id) {
		brakeRepository.deleteById(id);

	}

}
