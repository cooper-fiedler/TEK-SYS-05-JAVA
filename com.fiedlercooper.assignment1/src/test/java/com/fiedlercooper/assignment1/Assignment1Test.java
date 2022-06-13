package com.fiedlercooper.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Assignment1Test {

	@Test
	void testSort() {
		float actual[] = { (float) 0.345, (float) 0.678, (float) 0.123, (float) 0.456, (float) 0.567, (float) 0.234 };
		float expected[] = { (float) 0.123, (float) 0.234, (float) 0.345, (float) 0.456, (float) 0.567, (float) 0.678 };
		int n = actual.length;
		Assignment1.bucketSort(actual, n);
		
		assertEquals(expected, actual);
	}
}
