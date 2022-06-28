package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.Fork;
import com.fiedlercooper.bikeBuilder.repository.ForkRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class ForkServiceImpl implements ForkService{
	private ForkRepository forkRepository;

	public ForkServiceImpl(ForkRepository forkRepository) {
		this.forkRepository = forkRepository;
	}

	@Override
	public List<Fork> getAllForks() {
		return forkRepository.findAll();
	}

	@Override
	public Fork saveFork(Fork fork) {
		return forkRepository.save(fork);
	}

	@Override
	public Fork getForkById(Long id) {
		return forkRepository.findById(id).get();
	}

	@Override
	public Fork updateFork(Fork fork) {
		return forkRepository.save(fork);
	}

	@Override
	public void deleteForkById(Long id) {
		forkRepository.deleteById(id);
		
	}
	

}
