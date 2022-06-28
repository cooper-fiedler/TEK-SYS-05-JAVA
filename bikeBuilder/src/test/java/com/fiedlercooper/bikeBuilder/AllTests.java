package com.fiedlercooper.bikeBuilder;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectPackages({"src.test.java.com.fiedlercooper.bikeBuilder"})
@SelectClasses({BikeBuilderUserRepositoryTests.class, BikeBuilderApplicationQueryTests.class, BikeBuilderApplicationServiceTests.class})

@Suite
public class AllTests {

}
