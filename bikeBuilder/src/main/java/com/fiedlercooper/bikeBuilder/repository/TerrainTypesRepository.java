package com.fiedlercooper.bikeBuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;

// REPOSITORY TO EXTEND JPA REPO FOR ADDITIONAL DATABASE METHODS, QUERIES, AND CONTROLS

public interface TerrainTypesRepository extends JpaRepository<TerrainTypes, Long>{
	
	// CUSTOM QUERY TO PULL A LIST OF TERRAIN TYPES BASED ON SELECTED FRAME
	
	@Query(value="SELECT tt.* FROM terrain_types tt JOIN terrain_types_frames ttf "
			+ "ON ttf.terrain_types_id = tt.id JOIN frame_table ft ON ft.id = ttf.frame_id "
			+ "WHERE ft.id = :frameId", nativeQuery=true)
    List<TerrainTypes> findTerrainTypeByFrameId(Long frameId);
	
	// CUSTOM QUERY TO PULL A LIST OF TERRAIN TYPES BASED ON SELECTED FORK
	
	@Query(value="SELECT tt.* FROM fork_table fot\r\n"
			+ "JOIN terrain_types_forks ttfo ON ttfo.fork_id = fot.id\r\n"
			+ "JOIN terrain_types tt ON tt.id = ttfo.terrain_types_id\r\n"
			+ "WHERE fot.id = :forkId", nativeQuery=true)
    List<TerrainTypes> findTerrainTypeByForkId(Long forkId);

}
