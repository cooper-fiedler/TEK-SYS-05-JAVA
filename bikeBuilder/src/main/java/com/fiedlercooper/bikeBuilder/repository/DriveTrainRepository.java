package com.fiedlercooper.bikeBuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiedlercooper.bikeBuilder.entity.DriveTrain;

public interface DriveTrainRepository extends JpaRepository<DriveTrain, Long>{
	
	@Query(value="SELECT dt.* FROM drive_train_table dt\r\n"
			+ "JOIN terrain_types_drive_trains ttdt ON ttdt.drive_train_id = dt.id\r\n"
			+ "JOIN terrain_types tt ON tt.id = ttdt.terrain_types_id\r\n"
			+ "WHERE ttdt.terrain_types_id = :terrainType", nativeQuery=true)
    List<DriveTrain> findDriveTrainByTerrainType(Long terrainType);
	
}
