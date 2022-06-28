package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.Bike;
import com.fiedlercooper.bikeBuilder.repository.BikeRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class BikeServiceImpl implements BikeService {

	private BikeRepository bikeRepository;

	public BikeServiceImpl(BikeRepository bikeRepository) {
		this.bikeRepository = bikeRepository;
	}

	@Override
	public List<Bike> getAllBikes() {
		return bikeRepository.findAll();
	}

	@Override
	public Bike saveBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	public Bike getBikeById(Long id) {
		return bikeRepository.findById(id).get();
	}

	@Override
	public Bike updateBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	public void deleteBikeById(Long id) {
		bikeRepository.deleteById(id);

	}

}
