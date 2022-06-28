package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;

//INTERFACE FOR GENERAL CRUD OPERATIONS

public interface TerrainTypeService {
	List<TerrainTypes> getAllTerrainTypes();

	TerrainTypes saveTerrainType(TerrainTypes terrainType);

	TerrainTypes getTerrainTypeById(Long id);

	TerrainTypes updateTerrainType(TerrainTypes terrainType);

	void deleteTerrainTypeById(Long id);
}
