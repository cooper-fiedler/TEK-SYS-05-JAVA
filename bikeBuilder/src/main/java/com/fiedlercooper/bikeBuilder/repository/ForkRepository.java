package com.fiedlercooper.bikeBuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiedlercooper.bikeBuilder.entity.Fork;

// REPOSITORY TO EXTEND JPA REPO FOR ADDITIONAL DATABASE METHODS, QUERIES, AND CONTROLS

public interface ForkRepository extends JpaRepository<Fork, Long> {

	// CUSTOM QUERY TO PULL A LIST OF FORKS BASED ON SELECTED TERRAIN TYPE AND WHEEL SIZE 

	@Query(value = "SELECT fot.* FROM fork_table fot\r\n"
			+ "JOIN terrain_types_forks ttfo ON ttfo.fork_id = fot.id\r\n"
			+ "JOIN terrain_types tt ON tt.id = ttfo.terrain_types_id\r\n"
			+ "JOIN wheel_sizes_forks wsfo ON wsfo.fork_id = fot.id\r\n"
			+ "JOIN wheel_sizes ws ON ws.id = wsfo.wheel_size_id\r\n"
			+ "WHERE ttfo.terrain_types_id = :terrainType AND wsfo.wheel_size_id = :wheelSize", nativeQuery = true)
	List<Fork> findForkByTerrainTypeAndWheelSize(Long terrainType, Long wheelSize);	
	
}
