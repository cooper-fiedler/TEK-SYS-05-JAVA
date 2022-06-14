package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.Fork;

public interface ForkService {
	List<Fork> getAllForks();

	Fork saveFork(Fork fork);

	Fork getForkById(Long id);

	Fork updateFork(Fork fork);

	void deleteForkById(Long id);
}
