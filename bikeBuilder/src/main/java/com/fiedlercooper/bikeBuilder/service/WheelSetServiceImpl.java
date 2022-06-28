package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.WheelSet;
import com.fiedlercooper.bikeBuilder.repository.WheelSetRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class WheelSetServiceImpl implements WheelSetService{
	private WheelSetRepository wheelSetRepository;

	public WheelSetServiceImpl(WheelSetRepository wheelSetRepository) {
		this.wheelSetRepository = wheelSetRepository;
	}

	@Override
	public List<WheelSet> getAllWheelSets() {
		return wheelSetRepository.findAll();
	}

	@Override
	public WheelSet saveWheelSet(WheelSet wheelSet) {
		return wheelSetRepository.save(wheelSet);
	}

	@Override
	public WheelSet getWheelSetById(Long id) {
		return wheelSetRepository.findById(id).get();
	}

	@Override
	public WheelSet updateWheelSet(WheelSet wheelSet) {
		return wheelSetRepository.save(wheelSet);
	}

	@Override
	public void deleteWheelSetById(Long id) {
		wheelSetRepository.deleteById(id);
		
	}
	

}
