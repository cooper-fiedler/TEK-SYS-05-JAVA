package com.fiedlercooper.bikeBuilder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiedlercooper.bikeBuilder.entity.Frame;
import com.fiedlercooper.bikeBuilder.repository.FrameRepository;

@Service
public class FrameServiceImpl implements FrameService{
	private FrameRepository frameRepository;

	public FrameServiceImpl(FrameRepository frameRepository) {
		this.frameRepository = frameRepository;
	}

	@Override
	public List<Frame> getAllFrames() {
	return frameRepository.findAll();
	}

	@Override
	public Frame saveFrame(Frame frame) {
		return frameRepository.save(frame);
	}

	@Override
	public Frame getFrameById(Long id) {
		return frameRepository.findById(id).get();
	}

	@Override
	public Frame updateFrame(Frame frame) {
		return frameRepository.save(frame);
	}

	@Override
	public void deleteFrameById(Long id) {
		frameRepository.deleteById(id);
		
	}
	

}
