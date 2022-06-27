package com.fiedlercooper.bikeBuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiedlercooper.bikeBuilder.entity.Brake;

public interface BrakeRepository extends JpaRepository<Brake, Long>{
	
	@Query(value="SELECT b.* FROM brake_table b\r\n"
			+ "JOIN terrain_types_brakes ttb ON ttb.brake_id = b.id\r\n"
			+ "JOIN terrain_types tt ON tt.id = ttb.terrain_types_id\r\n"
			+ "WHERE ttb.terrain_types_id = :terrainType", nativeQuery=true)
    List<Brake> findBrakeByTerrainType(Long terrainType);

}
