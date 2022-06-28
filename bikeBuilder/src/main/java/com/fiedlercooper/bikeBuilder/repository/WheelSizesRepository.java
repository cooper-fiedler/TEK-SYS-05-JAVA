package com.fiedlercooper.bikeBuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiedlercooper.bikeBuilder.entity.WheelSizes;

// REPOSITORY TO EXTEND JPA REPO FOR ADDITIONAL DATABASE METHODS, QUERIES, AND CONTROLS

public interface WheelSizesRepository extends JpaRepository<WheelSizes, Long>{

	// CUSTOM QUERY TO PULL A LIST OF WHEEL SIZES BASED ON SELECTED FRAME
	
	@Query(value="SELECT ws.* FROM wheel_sizes ws JOIN wheel_sizes_frames wsf "
			+ "ON wsf.wheel_size_id = ws.id JOIN frame_table ft ON ft.id = wsf.frame_id "
			+ "WHERE ft.id = :frameId", nativeQuery=true)
    List<WheelSizes> findWheelSizeByFrameId(Long frameId);
	
	// CUSTOM QUERY TO PULL A LIST OF WHEEL SIZES BASED ON SELECTED FORK
	
	@Query(value="SELECT ws.* FROM fork_table fot\r\n"
			+ "JOIN wheel_sizes_forks wsfo ON wsfo.fork_id = fot.id\r\n"
			+ "JOIN wheel_sizes ws ON ws.id = wsfo.wheel_size_id\r\n"
			+ "WHERE fot.id = :forkId", nativeQuery=true)
    List<WheelSizes> findWheelSizeByForkId(Long forkId);
}