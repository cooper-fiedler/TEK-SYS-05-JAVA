package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;
import com.fiedlercooper.bikeBuilder.repository.TerrainTypesRepository;

// SERVICE IMPLEMENTATION FOR INTERFACE WITH GENERAL CRUD OPERATIONS

@Service
public class TerrainTypeServiceImpl implements TerrainTypeService{
	private TerrainTypesRepository terrainTypesRepository;

	public TerrainTypeServiceImpl(TerrainTypesRepository terrainTypesRepository) {
		this.terrainTypesRepository = terrainTypesRepository;
	}

	@Override
	public List<TerrainTypes> getAllTerrainTypes() {
		return terrainTypesRepository.findAll();
	}

	@Override
	public TerrainTypes saveTerrainType(TerrainTypes terrainType) {
		return terrainTypesRepository.save(terrainType);
	}

	@Override
	public TerrainTypes getTerrainTypeById(Long id) {
		return terrainTypesRepository.findById(id).get();
	}

	@Override
	public TerrainTypes updateTerrainType(TerrainTypes terrainType) {
		return terrainTypesRepository.save(terrainType);
	}

	@Override
	public void deleteTerrainTypeById(Long id) {
		terrainTypesRepository.deleteById(id);
		
	}
	

}
