package com.fiedlercooper.bikeBuilder.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fiedlercooper.bikeBuilder.entity.Bike;
import com.fiedlercooper.bikeBuilder.entity.Brake;
import com.fiedlercooper.bikeBuilder.entity.DriveTrain;
import com.fiedlercooper.bikeBuilder.entity.Fork;
import com.fiedlercooper.bikeBuilder.entity.Frame;
import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;
import com.fiedlercooper.bikeBuilder.entity.WheelSet;
import com.fiedlercooper.bikeBuilder.entity.WheelSizes;
import com.fiedlercooper.bikeBuilder.repository.BrakeRepository;
import com.fiedlercooper.bikeBuilder.repository.DriveTrainRepository;
import com.fiedlercooper.bikeBuilder.repository.ForkRepository;
import com.fiedlercooper.bikeBuilder.repository.FrameRepository;
import com.fiedlercooper.bikeBuilder.repository.TerrainTypesRepository;
import com.fiedlercooper.bikeBuilder.repository.WheelSetRepository;
import com.fiedlercooper.bikeBuilder.repository.WheelSizesRepository;
import com.fiedlercooper.bikeBuilder.service.BikeService;
import com.fiedlercooper.bikeBuilder.service.FrameService;

@Controller
public class CompatibilityController {

	@Autowired
	FrameRepository frameRepository;

	@Autowired
	ForkRepository forkRepository;

	@Autowired
	BrakeRepository brakeRepository;

	@Autowired
	DriveTrainRepository driveTrainRepository;

	@Autowired
	WheelSetRepository wheelSetRepository;

	@Autowired
	FrameService frameService;

	@Autowired
	TerrainTypesRepository terrainTypesRepository;

	@Autowired
	WheelSizesRepository wheelSizesRepository;
	
	@Autowired
	BikeService bikeService;
	
	// FOR JQUERY TO GET FORKS UPON FRAME SELECTION IN CREATING NEW BIKE

	@GetMapping("bikes/getForks")
	@ResponseBody
	public List<Fork> selectFork(@RequestParam("id") Long id) {
		List<TerrainTypes> terrainTypes = terrainTypesRepository.findTerrainTypeByFrameId(id);
		List<WheelSizes> wheelSizes = wheelSizesRepository.findWheelSizeByFrameId(id);
		List<Fork> forks = new ArrayList<Fork>();
		for (TerrainTypes type : terrainTypes) {
			for (WheelSizes size : wheelSizes) {
				forks.addAll(forkRepository.findForkByTerrainTypeAndWheelSize(type.getId(), size.getId()));
			}
		}
		Set<Fork> removeDuplicates = new HashSet<Fork>(forks);
		forks.clear();
		forks.addAll(removeDuplicates);
		return forks;
	}
	
	// FOR JQUERY TO GET FORKS UPON FRAME SELECTION IN EDITING
	
	@GetMapping("bikes/edit/getForks")
	@ResponseBody
	public List<Fork> selectForkEdit(@RequestParam("id") Long id) {
		List<TerrainTypes> terrainTypes = terrainTypesRepository.findTerrainTypeByFrameId(id);
		List<WheelSizes> wheelSizes = wheelSizesRepository.findWheelSizeByFrameId(id);
		List<Fork> forks = new ArrayList<Fork>();
		for (TerrainTypes type : terrainTypes) {
			for (WheelSizes size : wheelSizes) {
				forks.addAll(forkRepository.findForkByTerrainTypeAndWheelSize(type.getId(), size.getId()));
			}
		}
		Set<Fork> removeDuplicates = new HashSet<Fork>(forks);
		forks.clear();
		forks.addAll(removeDuplicates);
		return forks;
	}
	
	// FOR JQUERY TO GET COMPONENTS UPON FORK SELECTION IN CREATING NEW BIKE
	
	@GetMapping("bikes/getComponents")
	@ResponseBody
	public List<List<Object>> selectComponents(@RequestParam("id") Long id){
		List<List<Object>> results = new ArrayList<List<Object>>();
		List<TerrainTypes> terrainTypes = terrainTypesRepository.findTerrainTypeByForkId(id);
		List<WheelSizes> wheelSizes = wheelSizesRepository.findWheelSizeByForkId(id);
		List<DriveTrain> driveTrains = new ArrayList<DriveTrain>();
		List<Brake> brakes = new ArrayList<Brake>();
		List<WheelSet> wheelSets = new ArrayList<WheelSet>();
		for (TerrainTypes type : terrainTypes) {
			brakes.addAll(brakeRepository.findBrakeByTerrainType(type.getId()));
			driveTrains.addAll(driveTrainRepository.findDriveTrainByTerrainType(type.getId()));
		}
		for (WheelSizes size : wheelSizes) {
			wheelSets.addAll(wheelSetRepository.findWheelSetByWheelSize(size.getId()));
		}
		
		Set<DriveTrain> removeDuplicateDriveTrains = new HashSet<DriveTrain>(driveTrains);
		driveTrains.clear();
		driveTrains.addAll(removeDuplicateDriveTrains);
		driveTrains.sort(Comparator.comparing(DriveTrain::getId));
		
		
		Set<Brake> removeDuplicateBrakes = new HashSet<Brake>(brakes);
		brakes.clear();
		brakes.addAll(removeDuplicateBrakes);
		brakes.sort(Comparator.comparing(Brake::getId));
				
		Set<WheelSet> removeDuplicateWheelSets = new HashSet<WheelSet>(wheelSets);
		wheelSets.clear();
		wheelSets.addAll(removeDuplicateWheelSets);
		wheelSets.sort(Comparator.comparing(WheelSet::getId));
		
		List<Object> driveTrainObjectList = new ArrayList<Object>(driveTrains);
		List<Object> brakeObjectList = new ArrayList<Object>(brakes);
		List<Object> wheelSetObjectList = new ArrayList<Object>(wheelSets);
		
		results.add(driveTrainObjectList);
		results.add(brakeObjectList);
		results.add(wheelSetObjectList);
		
		return results;
	}
	
	// FOR JQUERY TO GET COMPONENTS UPON FORK SELECTION IN EDITING
	
	@GetMapping("bikes/edit/getComponents")
	@ResponseBody
	public List<List<Object>> selectComponentsEdit(@RequestParam("id") Long id){
		List<List<Object>> results = new ArrayList<List<Object>>();
		List<TerrainTypes> terrainTypes = terrainTypesRepository.findTerrainTypeByForkId(id);
		List<WheelSizes> wheelSizes = wheelSizesRepository.findWheelSizeByForkId(id);
		List<DriveTrain> driveTrains = new ArrayList<DriveTrain>();
		List<Brake> brakes = new ArrayList<Brake>();
		List<WheelSet> wheelSets = new ArrayList<WheelSet>();
		for (TerrainTypes type : terrainTypes) {
			brakes.addAll(brakeRepository.findBrakeByTerrainType(type.getId()));
			driveTrains.addAll(driveTrainRepository.findDriveTrainByTerrainType(type.getId()));
		}
		for (WheelSizes size : wheelSizes) {
			wheelSets.addAll(wheelSetRepository.findWheelSetByWheelSize(size.getId()));
		}
		
		Set<DriveTrain> removeDuplicateDriveTrains = new HashSet<DriveTrain>(driveTrains);
		driveTrains.clear();
		driveTrains.addAll(removeDuplicateDriveTrains);
		driveTrains.sort(Comparator.comparing(DriveTrain::getId));
		
		
		Set<Brake> removeDuplicateBrakes = new HashSet<Brake>(brakes);
		brakes.clear();
		brakes.addAll(removeDuplicateBrakes);
		brakes.sort(Comparator.comparing(Brake::getId));
				
		Set<WheelSet> removeDuplicateWheelSets = new HashSet<WheelSet>(wheelSets);
		wheelSets.clear();
		wheelSets.addAll(removeDuplicateWheelSets);
		wheelSets.sort(Comparator.comparing(WheelSet::getId));
		
		List<Object> driveTrainObjectList = new ArrayList<Object>(driveTrains);
		List<Object> brakeObjectList = new ArrayList<Object>(brakes);
		List<Object> wheelSetObjectList = new ArrayList<Object>(wheelSets);
		
		results.add(driveTrainObjectList);
		results.add(brakeObjectList);
		results.add(wheelSetObjectList);
		
		return results;
	}
	
	// FOR JQUERY TO GET CURRENT BIKE BUILD FOR DETAILS
	
	@GetMapping("bikes/getBike")
	@ResponseBody
	public List<Object> getBike(@RequestParam("id") Long id){
		Bike bike = bikeService.getBikeById(id);
		Frame frame = bike.getBikeFrame();
		Fork fork = bike.getBikeFork();
		DriveTrain driveTrain = bike.getBikeDriveTrain();
		Brake brake = bike.getBikeBrake();
		WheelSet wheelSet = bike.getBikeWheelSet();
		
		List<Object> build = new ArrayList<Object>();
		
		build.add(frame);
		build.add(fork);
		build.add(driveTrain);
		build.add(brake);
		build.add(wheelSet);
		
		return build;	
	}
	


}
