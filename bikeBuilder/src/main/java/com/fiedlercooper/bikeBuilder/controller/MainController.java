package com.fiedlercooper.bikeBuilder.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fiedlercooper.bikeBuilder.entity.Fork;
import com.fiedlercooper.bikeBuilder.entity.Frame;
import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;
import com.fiedlercooper.bikeBuilder.entity.WheelSizes;
//import com.fiedlercooper.bikeBuilder.repository.BrakeRepository;
//import com.fiedlercooper.bikeBuilder.repository.DriveTrainRepository;
import com.fiedlercooper.bikeBuilder.repository.ForkRepository;
import com.fiedlercooper.bikeBuilder.repository.FrameRepository;
import com.fiedlercooper.bikeBuilder.repository.TerrainTypesRepository;
//import com.fiedlercooper.bikeBuilder.repository.WheelSetRepository;
import com.fiedlercooper.bikeBuilder.repository.WheelSizesRepository;
//import com.fiedlercooper.bikeBuilder.repository.WheelSetRepository;

@Controller
@RequestMapping(path = "/bikes")
public class MainController {

//	@Autowired
//	private BrakeRepository brakeRepo;
//	@Autowired
//	private DriveTrainRepository driveTrainRepo;
	@Autowired
	private FrameRepository frameRepo;
	@Autowired
	private ForkRepository forkRepo;
	@Autowired
	private WheelSizesRepository WheelSizeRepo;
//	@Autowired
//	private WheelSetRepository wheelSetRepo;
	@Autowired
	private TerrainTypesRepository TerrainTypeRepo;

	@GetMapping(path = "/getallframes")
	public @ResponseBody Iterable<Frame> getAllFrames() {
		return frameRepo.findAll();
	}

	@PostMapping(path = "/addframe")
	public @ResponseBody String addNewFrame(@RequestParam String brand, @RequestParam String model,
			@RequestParam Float cost, @RequestParam Long wid, @RequestParam Long tt) {
		Frame newFrame = new Frame();
		newFrame.setBrand(brand);
		newFrame.setModel(model);
		newFrame.setCost(cost);
		frameRepo.save(newFrame);

		List<Frame> frames = new ArrayList<Frame>();
		frames.add(newFrame);

		Optional<WheelSizes> newWS = WheelSizeRepo.findById(wid);
		WheelSizes ws = newWS.get();
		ws.setAdditionalFrames(newFrame);
		WheelSizeRepo.save(ws);

		Optional<TerrainTypes> newTT = TerrainTypeRepo.findById(tt);
		TerrainTypes ter = newTT.get();
		ter.setAdditionalFrames(newFrame);
		TerrainTypeRepo.save(ter);

		return ("Saved new Frame!");
	}

	@PostMapping(path = "/addfork")
	public @ResponseBody String addNewFork(@RequestParam String brand, @RequestParam String model,
			@RequestParam Float cost, @RequestParam Long wid, @RequestParam Long tt) {
		Fork newFork = new Fork();
		newFork.setBrand(brand);
		newFork.setModel(model);
		newFork.setCost(cost);
		forkRepo.save(newFork);

		List<Fork> forks = new ArrayList<Fork>();
		forks.add(newFork);

		Optional<WheelSizes> newWS = WheelSizeRepo.findById(wid);
		WheelSizes ws = newWS.get();
		ws.setAdditionalForks(newFork);
		WheelSizeRepo.save(ws);

		Optional<TerrainTypes> newTT = TerrainTypeRepo.findById(tt);
		TerrainTypes ter = newTT.get();
		ter.setAdditionalForks(newFork);
		TerrainTypeRepo.save(ter);

		return ("Saved new Frame!");
	}
	
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}

}