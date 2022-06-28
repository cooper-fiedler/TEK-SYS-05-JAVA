package com.fiedlercooper.bikeBuilder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.fiedlercooper.bikeBuilder.entity.Bike;
import com.fiedlercooper.bikeBuilder.entity.Brake;
import com.fiedlercooper.bikeBuilder.entity.DriveTrain;
import com.fiedlercooper.bikeBuilder.entity.Fork;
import com.fiedlercooper.bikeBuilder.entity.Frame;
import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;
import com.fiedlercooper.bikeBuilder.entity.WheelSet;
import com.fiedlercooper.bikeBuilder.entity.WheelSizes;
import com.fiedlercooper.bikeBuilder.service.BikeService;
import com.fiedlercooper.bikeBuilder.service.BrakeService;
import com.fiedlercooper.bikeBuilder.service.CustomUserDetailsService;
import com.fiedlercooper.bikeBuilder.service.DriveTrainService;
import com.fiedlercooper.bikeBuilder.service.ForkService;
import com.fiedlercooper.bikeBuilder.service.FrameService;
import com.fiedlercooper.bikeBuilder.service.TerrainTypeService;
import com.fiedlercooper.bikeBuilder.service.WheelSetService;
import com.fiedlercooper.bikeBuilder.service.WheelSizeService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BikeBuilderApplicationServiceTests {
	
	@Autowired
	BikeService bikeService;
	
	@Autowired
	FrameService frameService;
	
	@Autowired
	ForkService forkService;
	
	@Autowired
	DriveTrainService driveTrainService;
	
	@Autowired
	BrakeService brakeService;
	
	@Autowired
	WheelSetService wheelSetService;
	
	@Autowired
	TerrainTypeService terrainTypeService;
	
	@Autowired
	WheelSizeService wheelSizeService;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	

	
	@Test
	void bikeServiceTest() {
	Bike bike = bikeService.getBikeById((long) 1);
	
	assertEquals(bike.getBikeBrake().getModel(), "Tech 2");
		
	}
	
	@Test
	void frameServiceTest() {
	Frame frame = frameService.getFrameById((long) 1);
	
	assertEquals(frame.getCost(), (float) 6000.55);
		
	}
	
	@Test
	void forkServiceTest() {
	Fork fork = forkService.getForkById((long) 1);
	
	assertEquals(fork.getBrand(), "Fox");
		
	}
	
	@Test
	void driveTrainServiceTest() {
	DriveTrain driveTrain = driveTrainService.getDriveTrainById((long) 1);
	
	assertEquals(driveTrain.getGears(), 12);
		
	}
	
	@Test
	void brakeServiceTest() {
	Brake brake = brakeService.getBrakeById((long) 1);
	
	assertEquals(brake.getModel(), "Tech 3");
		
	}
	
	@Test
	void wheelSetServiceTest() {
	WheelSet wheelSet = wheelSetService.getWheelSetById((long) 1);
		
	assertEquals(wheelSet.getBrand(), "Race Face");
	}
	
	@Test
	void terrainServiceTest() {
	TerrainTypes terrainType = terrainTypeService.getTerrainTypeById((long) 1);
	
	assertEquals(terrainType.getType(), "DH");
	}
	
	@Test
	void wheelSizeServiceTest() {
	WheelSizes wheelSize = wheelSizeService.getWheelSizeById((long) 1);
	
	assertEquals(wheelSize.getSize(), "27.5");	
	}
	
	@Test
	void userServiceTest1() {
	UserDetails userDetails = customUserDetailsService.loadUserByUsername("cooperfiedler@email.com");
	
	assertEquals(userDetails.isEnabled(), true);
		
	}
	
	@Test
	void userServiceTest2() {
	boolean thrown = false;
		
	try {
	customUserDetailsService.loadUserByUsername("fiedler@email.com");
	} catch (UsernameNotFoundException e) {
		thrown = true;
	}
	
	assertTrue(thrown);
		
	}
}
