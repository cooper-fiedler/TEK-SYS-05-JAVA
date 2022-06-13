package com.fiedlercooper.bikeBuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiedlercooper.bikeBuilder.entity.Frame;

public interface FrameRepository extends JpaRepository<Frame, Long>{

}