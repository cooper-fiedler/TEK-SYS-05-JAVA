package com.fiedlercooper.bikeBuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiedlercooper.bikeBuilder.entity.WheelSet;

public interface WheelSetRepository extends JpaRepository<WheelSet, Long>{

	@Query(value="SELECT wst.* FROM wheel_set_table wst\r\n"
			+ "JOIN wheel_sizes_wheel_sets wsws ON wsws.wheel_set_id = wst.id\r\n"
			+ "JOIN wheel_sizes ws ON ws.id = wsws.wheel_size_id\r\n"
			+ "WHERE wsws.wheel_size_id = :wheelSize", nativeQuery=true)
    List<WheelSet> findWheelSetByWheelSize(Long wheelSize);	
	
}
