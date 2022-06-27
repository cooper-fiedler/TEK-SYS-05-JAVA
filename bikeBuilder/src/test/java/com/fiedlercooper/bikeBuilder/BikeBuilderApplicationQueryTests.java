package com.fiedlercooper.bikeBuilder;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fiedlercooper.bikeBuilder.entity.Brake;
import com.fiedlercooper.bikeBuilder.entity.DriveTrain;
import com.fiedlercooper.bikeBuilder.entity.Fork;
import com.fiedlercooper.bikeBuilder.entity.TerrainTypes;
import com.fiedlercooper.bikeBuilder.entity.User;
import com.fiedlercooper.bikeBuilder.entity.WheelSet;
import com.fiedlercooper.bikeBuilder.entity.WheelSizes;
import com.fiedlercooper.bikeBuilder.repository.BrakeRepository;
import com.fiedlercooper.bikeBuilder.repository.DriveTrainRepository;
import com.fiedlercooper.bikeBuilder.repository.ForkRepository;
import com.fiedlercooper.bikeBuilder.repository.TerrainTypesRepository;
import com.fiedlercooper.bikeBuilder.repository.UserRepository;
import com.fiedlercooper.bikeBuilder.repository.WheelSetRepository;
import com.fiedlercooper.bikeBuilder.repository.WheelSizesRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BikeBuilderApplicationQueryTests {
	
	@Autowired
	ForkRepository forkRepository;
	
	@Autowired
	DriveTrainRepository driveTrainRepository;
	
	@Autowired
	BrakeRepository brakeRepository;
	
	@Autowired
	WheelSetRepository wheelSetRepository;
	
	@Autowired
	TerrainTypesRepository terrainTypesRepository;
	
	@Autowired
	WheelSizesRepository wheelSizesRepository;
	
	@Autowired
	UserRepository userRepository;
	

	@Test
	void forkQueryTest() {
	List<Fork> forks = forkRepository.findForkByTerrainTypeAndWheelSize((long) 2, (long) 1);
	
	assertEquals(forks.get(0).getBrand(), "Fox");
	}
	
	@Test
	void driveTrainQueryTest() {
	List<DriveTrain> driveTrains = driveTrainRepository.findDriveTrainByTerrainType((long) 1);
	
	assertEquals(driveTrains.get(0).getModel(), "X01");
	}
	
	@Test
	void brakeQueryTest() {
	List<Brake> brakes = brakeRepository.findBrakeByTerrainType((long) 1);
	
	assertEquals(brakes.get(0).getCost(), 224);		
	}
	
	@Test
	void wheelSetQueryTest() {
	List<WheelSet> wheelSets = wheelSetRepository.findWheelSetByWheelSize((long) 1);
	
	assertEquals(wheelSets.get(0).getBrand(), "Race Face");
	}
	
	@Test
	void terrainQueryTest1() {
	List<TerrainTypes> terrainTypes = terrainTypesRepository.findTerrainTypeByForkId((long) 1);
	
	assertEquals(terrainTypes.get(0).getType(), "EN");
	}
	
	@Test
	void terrainQueryTest2() {
	List<TerrainTypes> terrainTypes = terrainTypesRepository.findTerrainTypeByFrameId((long) 1);
	
	assertEquals(terrainTypes.get(0).getType(), "TR");
	}
	
	@Test
	void wheelSizeQueryTest1() {
	List<WheelSizes> wheelSizes = wheelSizesRepository.findWheelSizeByForkId((long) 1);	
		
	assertEquals(wheelSizes.get(0).getSize(), "27.5");
	}
	
	@Test
	void wheelSizeQueryTest2() {
	List<WheelSizes> wheelSizes = wheelSizesRepository.findWheelSizeByFrameId((long) 1);	
		
	assertEquals(wheelSizes.get(0).getSize(), "29");
	}
	
	@Test
	void userQueryTest() {
	User user = userRepository.findByEmail("cooperfiedler@email.com");
	
	assertEquals(user.getFirstName(), "Cooper");
	}
	
	
}
