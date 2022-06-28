package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import com.fiedlercooper.bikeBuilder.entity.Frame;

//INTERFACE FOR GENERAL CRUD OPERATIONS

public interface FrameService {
	List<Frame> getAllFrames();

	Frame saveFrame(Frame frame);

	Frame getFrameById(Long id);

	Frame updateFrame(Frame frame);

	void deleteFrameById(Long id);
}
