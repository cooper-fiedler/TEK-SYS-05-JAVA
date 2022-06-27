package com.fiedlercooper.bikeBuilder;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages("com.fiedlercooper.bikeBuilder")
@SelectClasses({BikeBuilderApplicationQueryTests.class, BikeBuilderApplicationServiceTests.class, BikeBuilderUserRepositoryTests.class})
@SuiteDisplayName("BikeBuilder Test Suite")

public class TestSuite {   
}  	