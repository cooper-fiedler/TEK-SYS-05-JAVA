package com.fiedlercooper.bikeBuilder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fiedlercooper.bikeBuilder.entity.Bike;
import com.fiedlercooper.bikeBuilder.service.BikeService;
import com.fiedlercooper.bikeBuilder.service.FrameService;


@Controller
public class BikeController {
	@Autowired
	private BikeService bikeService;
	
	@Autowired
	private FrameService frameService;
	

	public BikeController(BikeService bikeService) {
		this.bikeService = bikeService;
	}

	@GetMapping("/bikes")
	public String listBikes(Model model) {
		model.addAttribute("bikes", bikeService.getAllBikes());
		return "bikes";
	}
	
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/bikes/new")
	public String createBikeForm(Model model) {
		Bike bike = new Bike();
		model.addAttribute("bike", bike);
		model.addAttribute("frames", frameService.getAllFrames());

		return "create_bike";
	}
	

	
	@GetMapping("bikes/details/{id}")
	public String detailsPage(@PathVariable Long id, @ModelAttribute("bike") Bike bike, Model model) {
		
		Bike selectedBike = bikeService.getBikeById(id);
		model.addAttribute("frame", selectedBike.getBikeFrame());
		model.addAttribute("fork", selectedBike.getBikeFork());
		model.addAttribute("driveTrain", selectedBike.getBikeDriveTrain());
		model.addAttribute("brake", selectedBike.getBikeBrake());
		model.addAttribute("wheelSet", selectedBike.getBikeWheelSet());
		
		return "details";
	}
	


	@PostMapping("/bikes")
	public String saveBike(@ModelAttribute("bike") Bike bike) {
		bikeService.saveBike(bike);
		return "redirect:/bikes";
	}
	@GetMapping("/bikes/edit/{id}")
	public String editBikeForm(@PathVariable Long id, Model model) {
		model.addAttribute("bike", bikeService.getBikeById(id));
		model.addAttribute("frames", frameService.getAllFrames());
		
		return "edit_bike";
	}

	@PostMapping("/bikes/{id}")
	public String updateBike(@PathVariable Long id, @ModelAttribute("bike") Bike bike, Model model) {

		// get bike from database by id
		Bike existingBike = bikeService.getBikeById(id);
		existingBike.setId(id);
		existingBike.setBikeBrake(bike.getBikeBrake());
		existingBike.setBikeDriveTrain(bike.getBikeDriveTrain());
		existingBike.setBikeFork(bike.getBikeFork());
		existingBike.setBikeFrame(bike.getBikeFrame());
		existingBike.setBikeWheelSet(bike.getBikeWheelSet());
	
		// save updated bike object
		bikeService.updateBike(existingBike);
		return "redirect:/bikes";
	}

	// handler method to handle delete bike request

	@GetMapping("/bikes/{id}")
	public String deleteBike(@PathVariable Long id) {
		bikeService.deleteBikeById(id);
		
		return "redirect:/bikes";
	}

}
