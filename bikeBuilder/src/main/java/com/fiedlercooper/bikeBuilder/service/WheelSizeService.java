package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.WheelSizes;

//INTERFACE FOR GENERAL CRUD OPERATIONS

public interface WheelSizeService {
	List<WheelSizes> getAllWheelSizes();

	WheelSizes saveWheelSize(WheelSizes wheelSizes);

	WheelSizes getWheelSizeById(Long id);

	WheelSizes updateWheelSize(WheelSizes wheelSizes);

	void deleteWheelSizeById(Long id);
}
