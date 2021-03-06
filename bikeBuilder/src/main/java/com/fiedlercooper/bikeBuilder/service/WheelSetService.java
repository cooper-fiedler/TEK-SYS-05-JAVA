package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.WheelSet;

//INTERFACE FOR GENERAL CRUD OPERATIONS

public interface WheelSetService {
	List<WheelSet> getAllWheelSets();

	WheelSet saveWheelSet(WheelSet wheelSet);

	WheelSet getWheelSetById(Long id);

	WheelSet updateWheelSet(WheelSet wheelSet);

	void deleteWheelSetById(Long id);
}
