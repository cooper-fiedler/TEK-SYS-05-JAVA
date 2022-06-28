package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.WheelSizes;
import com.fiedlercooper.bikeBuilder.repository.WheelSizesRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class WheelSizeServiceImpl implements WheelSizeService{
	private WheelSizesRepository wheelSizesRepository;

	public WheelSizeServiceImpl(WheelSizesRepository wheelSizesRepository) {
		this.wheelSizesRepository = wheelSizesRepository;
	}

	@Override
	public List<WheelSizes> getAllWheelSizes() {
		return wheelSizesRepository.findAll();
	}

	@Override
	public WheelSizes saveWheelSize(WheelSizes wheelSizes) {
		return wheelSizesRepository.save(wheelSizes);
	}

	@Override
	public WheelSizes getWheelSizeById(Long id) {
		return wheelSizesRepository.findById(id).get();
	}

	@Override
	public WheelSizes updateWheelSize(WheelSizes wheelSizes) {
		return wheelSizesRepository.save(wheelSizes);
	}

	@Override
	public void deleteWheelSizeById(Long id) {
		wheelSizesRepository.deleteById(id);
		
	}
	

}
